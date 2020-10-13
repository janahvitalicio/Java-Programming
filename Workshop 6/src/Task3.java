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

public class Task3 extends JPanel {
	
	public static void main(String[] args) {
		
		JPanel wholePanel = new JPanel();
		wholePanel.setLayout(new BoxLayout(wholePanel, BoxLayout.Y_AXIS));
		
		// Drop down menu
		JPanel firstPanel = new JPanel();
		
		String comboBoxItems[] = { "Red", "Blue", "Green", "Black", "White" };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.setPreferredSize(new Dimension(400, 20));
        
        firstPanel.add(cb);
        wholePanel.add(firstPanel);
        
        // Check box
        JPanel secondPanel = new JPanel();
        
        JCheckBox background = new JCheckBox("Background");
        JCheckBox foreground = new JCheckBox("Foreground");
        
        secondPanel.add(background);
        secondPanel.add(foreground);
        
        wholePanel.add(secondPanel);
        
        // Creates space
        wholePanel.add(Box.createRigidArea(new Dimension(0, 100)));
        
        // Ok and Cancel buttons
        JPanel thirdPanel = new JPanel();
		
	    JButton okButton = new JButton("Ok");
	    okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	    okButton.setPreferredSize(new Dimension(60, 20));
	    okButton.setBackground(Color.WHITE);
	    okButton.setBorder(new LineBorder(Color.GRAY));
	    thirdPanel.add(okButton);
        
	    thirdPanel.add(Box.createRigidArea(new Dimension(10, 0)));
	    
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        cancelButton.setPreferredSize(new Dimension(60, 20));
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setBorder(new LineBorder(Color.GRAY));
        thirdPanel.add(cancelButton);
        
        wholePanel.add(thirdPanel);
        
        
        // Set up frame
 		JFrame frame = new JFrame("Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        //Set up content pane
        frame.getContentPane().add(wholePanel);
         
        //Display window
        frame.setSize(500, 250);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
	}
}
