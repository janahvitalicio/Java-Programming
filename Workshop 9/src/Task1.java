/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 9
 * Date:    April 6, 2020
 */

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Task1 {

	// Use ByteArrayOutputStream and PrintStream to store the thread output
	public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	public static PrintStream ps = new PrintStream(outputStream);
	public static PrintStream old = System.out; // Save old System.out
	
	public static void main(String[] args) {
	    // Create tasks
	    Runnable printA = new PrintChar('a', 100);
	    Runnable printB = new PrintChar('b', 100);
	    Runnable print100 = new PrintNum(100);

	    // Create threads
	    Thread thread1 = new Thread(printA);
	    Thread thread2 = new Thread(printB);
	    Thread thread3 = new Thread(print100);

	    // Start threads
	    thread1.start();
	    thread2.start();
	    thread3.start();
	    
	    System.out.flush();
	    System.setOut(old);

	    // Text area
	    JPanel panel = new JPanel();
	    JTextArea textArea = new JTextArea(outputStream.toString());
	    textArea.setMargin(new Insets(5,5,5,5));
	    textArea.setLineWrap(true);
  	    JScrollPane scrollPane = new JScrollPane(textArea);
  	    scrollPane.getViewport().setPreferredSize(new Dimension(425, 200));
  	    textArea.setEditable(false);
  	    panel.add(scrollPane);
	    
	    // Set up frame
 		JFrame frame = new JFrame("Concurrent Output");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        // Set up content panel
        frame.add(panel);
         
        // Display window
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(450, 250);
        frame.setLocationRelativeTo(null);
	  }
	}


	class PrintChar implements Runnable {
	  private char charToPrint;
	  private int times;

	  public PrintChar(char c, int t) {
	    charToPrint = c;
	    times = t;
	  }

	  @Override
	  public void run() {
	    for (int i = 0; i < times; i++) {
	      System.setOut(Task1.ps); // Use output stream
	      System.out.print(charToPrint + " ");
	    }
	  }
	}

	class PrintNum implements Runnable {
	  private int lastNum;

	  public PrintNum(int n) {
	    lastNum = n;
	  }

	  @Override
	  public void run() {
	    for (int i = 1; i <= lastNum; i++) {
	      System.setOut(Task1.ps); // Use output stream
	      System.out.print(i + " ");
	    }
	  }

}
