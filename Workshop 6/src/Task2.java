/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 6
 * Date:    February 22, 2020
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Task2 extends JPanel {
	
	public static void main(String[] args) {
		JPanel wholePanel = new JPanel();
		wholePanel.setLayout(new BoxLayout(wholePanel, BoxLayout.Y_AXIS));
		
		// Q and B buttons
		JPanel firstPanel = new JPanel();
		
	    JButton qButton = new JButton("Q");
	    qButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	    qButton.setPreferredSize(new Dimension(60, 20));
	    qButton.setBackground(Color.WHITE);
	    qButton.setBorder(new LineBorder(Color.GRAY));
	    firstPanel.add(qButton);
        
	    firstPanel.add(Box.createRigidArea(new Dimension(10, 0)));
	    
        JButton bButton = new JButton("B");
        bButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        bButton.setPreferredSize(new Dimension(60, 20));
        bButton.setBackground(Color.WHITE);
        bButton.setBorder(new LineBorder(Color.GRAY));
        firstPanel.add(bButton);
        
        wholePanel.add(firstPanel);
        
        // Creates space
        wholePanel.add(Box.createRigidArea(new Dimension(0, 30)));
        
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        
        // C and Programming is fun buttons
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new FlowLayout());
        
        JButton cButton = new JButton("C");
        cButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        cButton.setPreferredSize(new Dimension(60, 60));
        cButton.setBackground(Color.WHITE);
        cButton.setBorder(new LineBorder(Color.GRAY));
        secondPanel.add(cButton);
        
	    JButton pifButton = new JButton("Programming is fun!");
	    pifButton.setPreferredSize(new Dimension(350, 60));
	    pifButton.setBackground(Color.WHITE);
	    pifButton.setBorder(null);
	    pifButton.setHorizontalAlignment(SwingConstants.LEFT);
	    pifButton.setBorder(new LineBorder(Color.GRAY));
	    secondPanel.add(pifButton);
        
	    boxPanel.add(secondPanel);
	    
	    // D and E buttons
	    JPanel thirdPanel = new JPanel();
	    thirdPanel.setLayout(new FlowLayout());
        
        JButton dButton = new JButton("D");
        dButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        dButton.setPreferredSize(new Dimension(205, 60));
        dButton.setBackground(Color.WHITE);
        dButton.setBorder(new LineBorder(Color.GRAY));
        thirdPanel.add(dButton);
        
	    JButton eButton = new JButton("E");
	    eButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	    eButton.setPreferredSize(new Dimension(205, 60));
	    eButton.setBackground(Color.WHITE);
	    eButton.setBorder(new LineBorder(Color.GRAY));
	    thirdPanel.add(eButton);
	    
	    boxPanel.add(thirdPanel);
	    wholePanel.add(boxPanel);
        
        // Set up frame
		JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up content pane
        frame.getContentPane().add(wholePanel);
        
        //Display window
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
	}
}
