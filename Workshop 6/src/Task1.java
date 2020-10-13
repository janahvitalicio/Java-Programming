/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 6
 * Date:    February 22, 2020
 */

import java.awt.*;
import javax.swing.*;

public class Task1 extends JPanel {
	
	public static void main(String[] args) {
		// Uses BoxLayout (layout manager)
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel welcome = new JLabel("WELCOME");
		welcome.setAlignmentX(Component.CENTER_ALIGNMENT);
		welcome.setFont(welcome.getFont().deriveFont(25.0f));
        panel.add(welcome);
        
        JLabel toThe = new JLabel("to the");
        toThe.setAlignmentX(Component.CENTER_ALIGNMENT);
  	  	toThe.setFont(toThe.getFont().deriveFont(17.0f));
  	  	panel.add(toThe);
  	  	
  	  	JLabel colourGame = new JLabel("Colour Game");
  	    colourGame.setAlignmentX(Component.CENTER_ALIGNMENT);
  	  	colourGame.setFont(colourGame.getFont().deriveFont(25.0f));
  	  	colourGame.setForeground(Color.RED);
  	  	panel.add(colourGame);
  	  	
  	  	// Adds empty space to the panel
  	    panel.add(Box.createRigidArea(new Dimension(0, 100)));
  	    
  	    JLabel text = new JLabel("> Choose the colour of the provided items");
	    text.setAlignmentX(Component.CENTER_ALIGNMENT);
	    panel.add(text);
	    
	    panel.add(Box.createRigidArea(new Dimension(0, 40)));
		
	    JButton startButton = new JButton("Start");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.setMaximumSize(new Dimension(600, 60));
        startButton.setBackground(Color.WHITE);
        panel.add(startButton);

        // Set up frame
		JFrame frame = new JFrame("Colour Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up content pane
        frame.getContentPane().add(panel);
        
        //Display window
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(700, 360);
        frame.setLocationRelativeTo(null);
	}
	 

}
