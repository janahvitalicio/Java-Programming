/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 10
 * Date:    April 13, 2020
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class GameServer extends Application implements GameStatusConstants {
	
	public static void main(String[] args) {
        Application.launch();
    }
	
	@Override
	public void start(Stage pStage) {
		TextArea textArea = new TextArea();

		ScrollPane sp = new ScrollPane(textArea);
		sp.setPrefSize(480, 183);
		Scene scene = new Scene(sp);
		pStage.setTitle("Game Server");
		pStage.setScene(scene);
		pStage.setResizable(false);
		pStage.sizeToScene();
		pStage.show();

		Thread serverThread = new Thread() {
			public void run() {
				try {
					// Create a server socket
					ServerSocket sSocket = new ServerSocket(PORT);
					
					textArea.appendText(new Date() + ": Server started at " + PORT + "\n");
					
					while (true) {
						Platform.runLater(new Runnable() {
							@Override public void run() {
								textArea.appendText(new Date() + ": Waiting for players to join the game\n");
							}
						});
						
						
						//Accept connection from the Player 1
						Socket p1 = sSocket.accept();
						
						Platform.runLater(new Runnable() {
							@Override public void run() {
								textArea.appendText(new Date() + ": Player 1 joined the game\n"
										+ "Player 1 is with token X\n");
							}
						});
						
						//Notify Player 1 with token X
						new DataOutputStream(p1.getOutputStream()).writeInt(P1);
						
						//Accept connection from Player 2
						Socket p2 = sSocket.accept();
						
						Platform.runLater(new Runnable() {
							@Override public void run() {
								textArea.appendText(new Date() + ": Player 2 joined the game\n"
										+ "Player 2 is with token O\n");
							}
						});
						
						//Notify Player 2 with token O
						new DataOutputStream(p2.getOutputStream()).writeInt(P2);
						
						Platform.runLater(new Runnable() {
							@Override public void run() {
								textArea.appendText(new Date() + ": Game Start! \n");
							}
						});
						
						//Start a thread for game session
						new Thread (() -> {
							try {
								Socket game_P1 = p1;
								Socket game_P2 = p2;
								
								DataInputStream in_P1 = new DataInputStream(game_P1.getInputStream());
								DataInputStream in_P2 = new DataInputStream(game_P2.getInputStream());
								DataOutputStream out_P1 = new DataOutputStream(game_P1.getOutputStream());
								DataOutputStream out_P2 = new DataOutputStream(game_P2.getOutputStream());
								
								char[][] gameCells = new char[3][3];
								//Set cells into an empty initialized state
								for (int i = 0; i < gameCells.length; i++) {
									for(int j = 0; j < gameCells[i].length; j++) {
										gameCells[i][j] = ' ';
									}
								}
								
								//Notify Player 1 to start
								out_P1.writeInt(1);
								
								while (true) {
									// Receive row and column of the selected cell from Player 1
									int r = in_P1.readInt();
									int c = in_P1.readInt();
									gameCells[r][c] = 'X';
									
									//Determine game status(WIN, DRAW, CONTINUE)
									//If Player 1 wins, or draws, send the status to both players and send
									//P1's move to P2. Exit.
									if(checkWinner('X', gameCells)) {
										out_P1.writeInt(WIN_P1);
										out_P2.writeInt(WIN_P1);
										sendMove(out_P2, r, c);
										break; // exit loop
									}
									else if(isFull(gameCells)) {
										out_P1.writeInt(DRAW);
										out_P2.writeInt(DRAW);
										sendMove(out_P2, r, c);
										break;
									}
									else {
										//If CONTINUE, tell Player 2 to move
										out_P2.writeInt(CONTINUE);
										//Send P1's recently selected row and column index to P2
										sendMove(out_P2, r, c);
									}
									
									//Receive selected row and column from P2
									r = in_P2.readInt();
									c = in_P2.readInt();
									gameCells[r][c] = 'O';
									
									//If Player 2 wins, send status to both players and send
									//P2's move to P1. Exit.
									if(checkWinner('O', gameCells)) {
										out_P1.writeInt(WIN_P2);
										out_P2.writeInt(WIN_P2);
										sendMove(out_P1, r, c);
										break;
									}
									else {
										//If CONTINUE, tell Player 1 to move
										out_P1.writeInt(CONTINUE);
										//Send P2's recently selected row and column index to P1
										sendMove(out_P1, r, c);
									}
								}
								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}).start();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		serverThread.start();
	}
	
	public void sendMove(DataOutputStream out, int r, int c) throws Exception {
		out.writeInt(r);
		out.writeInt(c);
	}
	
	public boolean checkWinner(char token, char[][] gameCells) {
		//Check rows
		for(int i = 0; i < gameCells.length; i++) {
			if((gameCells[i][0] == token) && (gameCells[i][1] == token) && (gameCells[i][2] == token)) {
				return true;
			}
		}
		
		//Check columns
		for(int j = 0; j < gameCells.length; j++) {	
			if((gameCells[0][j] == token) && (gameCells[1][j] == token) && (gameCells[2][j] == token)) {
				return true;
			}
		}
		
		// Check diagonals
		if((gameCells[0][0] == token) && (gameCells[1][1] == token) && (gameCells[2][2] == token)) { 
			return true;
		}

		if((gameCells[0][2] == token) && (gameCells[1][1] == token) && (gameCells[2][0] == token)) {
			return true;
		}
		
		return false;
	}
	
	public boolean isFull(char[][] gameCells) {
		for (int i = 0; i < gameCells.length; i++) {
			for(int j = 0; j < gameCells[i].length; j++) {
				if(gameCells[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
	
	
}
