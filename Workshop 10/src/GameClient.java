/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 10
 * Date:    April 13, 2020
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class GameClient extends Application implements GameStatusConstants {

	private DataInputStream in_Server;
	private DataOutputStream out_Server;

	private char me = ' ';
	private char opponent = ' ';

	private Label gameTitle = new Label();
	private Label gameStatus = new Label();

	private int myTurn = 0;

	private int continueGame = 1;
	private boolean waiting = true;
	private int selectedRow;
	private int selectedColumn;

	private GameCell[][] gameCells = new GameCell[3][3];
	
	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage pStage) {
		GridPane grid = new GridPane();
		for(int i = 0; i < gameCells.length; i++) {
			for(int j = 0; j < gameCells[i].length; j++) {
				grid.add(gameCells[i][j] = new GameCell(i, j), j, i);
			}
		}
		grid.setStyle("-fx-background-color: white");
		
		BorderPane border = new BorderPane();
		border.setTop(gameTitle);
		border.setCenter(grid);
		border.setBottom(gameStatus);
		
		Scene scene = new Scene(border, 320, 350);
		pStage.setTitle("Game Client");
		pStage.setScene(scene);
		pStage.setResizable(false);
		pStage.sizeToScene();
		pStage.show();
		
		// Request connection to the server
		try {
			Socket cSocket = new Socket(HOST, PORT);

			in_Server = new DataInputStream(cSocket.getInputStream());
			out_Server = new DataOutputStream(cSocket.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread serverThread = new Thread() {
			public void run() {
				try {
					int p = in_Server.readInt();

					// Learn which token to use from the server
					if (p == P1) {
						me = 'X';
						opponent = 'O';

						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								gameTitle.setText("Player 1 with token 'X'");
								gameStatus.setText("Waiting for Player 2");
							}
						});
						
						//Get start signal from server
						in_Server.readInt();

						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								gameStatus.setText("Player 2 has joined. Player 1 starts first.");
							}
						});

						myTurn = 1;
					} else if (p == P2) {
						me = 'O';
						opponent = 'X';

						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								gameTitle.setText("Player 2 with token 'O'");
								gameStatus.setText("Waiting for Player 1's move");
							}
						});
					}

					while (continueGame == 1) {
						if (p == P1) {
							//Wait for player to move
							while (waiting) {
								Thread.sleep(150);
							}
							waiting = true;
							
							//Send selected row and column to server
							out_Server.writeInt(selectedRow);
							out_Server.writeInt(selectedColumn);
							
							//Receive game status from server
							fromServer();
						} else {
							//Receive game status from server
							fromServer();
							
							//Wait for player to move
							while (waiting) {
								Thread.sleep(150);
							}
							waiting = true;
							
							//Send selected row and column to server
							out_Server.writeInt(selectedRow);
							out_Server.writeInt(selectedColumn);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		serverThread.start();
	}

	private void fromServer() throws Exception {
		int stats = in_Server.readInt();
		
		//If WIN
		if (stats == WIN_P1) {
			continueGame = 0; //break the loop
			//Display the winner
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					gameStatus.setText("Player 1 (X) wins the game!");
				}
			});
		} else if (stats == WIN_P2) {
			continueGame = 0;
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					gameStatus.setText("Player 2 (O) wins the game!");
				}
			});
		} else if (stats == DRAW) { //If DRAW
			continueGame = 0;
			//Display GAME OVER
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					gameStatus.setText("No winner >>>>>>>>>>>>> GAME OVER");
				}
			});
			
			//Get opponent's move
			if (me == 'O') {
				int r = in_Server.readInt();
				int c = in_Server.readInt();
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						gameCells[r][c].setToken(opponent);
					}
				});
			}
		} else {
			int r = in_Server.readInt();
			int c = in_Server.readInt();
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					gameCells[r][c].setToken(opponent);
				}
			});

			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					gameStatus.setText("My turn");
				}
			});
			myTurn = 1;
		}
	}

	public class GameCell extends Pane {
		private int gameRow;
		private int gameColumn;

		private char token = ' ';
		
		public GameCell(int r, int c) {
			gameRow = r;
			gameColumn = c;
			this.setPrefSize(2000, 2000);
			setStyle("-fx-border-color: black");
			this.setOnMouseClicked(e -> mouseClicked());
		}

		public void setToken(char t) {
			token = t;
			draw();
		}
		
		//Draw X and O tokens
		private void draw() {
			if (token == 'X') {
				Line firstLine = new Line(5, 5, this.getWidth() - 5, this.getHeight() - 5);
				firstLine.endXProperty().bind(this.widthProperty().subtract(5));
				firstLine.endYProperty().bind(this.heightProperty().subtract(5));
				firstLine.setStroke(Color.BLUE);
				firstLine.setStrokeWidth(5);
				Line secondLine = new Line(5, this.getHeight() - 5, this.getWidth() - 5, 5);
				secondLine.startYProperty().bind(this.heightProperty().subtract(5));
				secondLine.endXProperty().bind(this.widthProperty().subtract(5));
				secondLine.setStroke(Color.BLUE);
				secondLine.setStrokeWidth(5);

				this.getChildren().addAll(firstLine, secondLine);
			} else if (token == 'O') {
				Ellipse circle = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				circle.centerXProperty().bind(this.widthProperty().divide(2));
				circle.centerYProperty().bind(this.heightProperty().divide(2));
				circle.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
				circle.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				circle.setStroke(Color.RED);
				circle.setFill(Color.WHITE);
				circle.setStrokeWidth(5);

				getChildren().add(circle);
			}
		}
		
		//If mouse is clicked
		private void mouseClicked() {
			if(token == ' ' && myTurn == 1) {
				setToken(me);
				myTurn = 0;
				selectedRow = gameRow;
				selectedColumn = gameColumn;
				gameStatus.setText("Waiting for opponent to move");
				waiting = false;
			}
		}
	}
	
}
