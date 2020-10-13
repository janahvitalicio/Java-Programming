/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 7
 * Date:    March 7, 2020
 */


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Try implements ActionListener {
	
	private static JTextArea textArea;
	private static JPanel wholePanel;
	
	public static void main(String[] args) {
		wholePanel = new JPanel();
		wholePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JLabel instructions = new JLabel("Type some text using your keyboard. The keys you press will be highlighted "
											+ "and the text will be displayed.");
		wholePanel.add(instructions);
        
        JLabel note = new JLabel("Note: Clicking the button with your mouse will not perform any action");
        wholePanel.add(note);
  	    
		// Text area
  	    JPanel textPanel = new JPanel();
  	    textArea = new JTextArea();
  	    textArea.setLineWrap(true);
  	    JScrollPane scrollPane = new JScrollPane(textArea);
  	    scrollPane.getViewport().setPreferredSize(new Dimension(830, 200));
  	    textPanel.add(scrollPane);
  	    wholePanel.add(textPanel);
  	    
  	    
  	    
  	    
  	    // Keyboard buttons--------------------------------------------------------------------------------------------
  	    JButton tilde = new JButton("~");
  	    tilde.setPreferredSize(new Dimension(50, 50));
  	    wholePanel.add(tilde);
  	    JButton one = new JButton("1");
	    one.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(one);
	    JButton two = new JButton("2");
	    two.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(two);
	    JButton three = new JButton("3");
	    three.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(three);
	    JButton four = new JButton("4");
	    four.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(four);
	    JButton five = new JButton("5");
	    five.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(five);
	    JButton six = new JButton("6");
	    six.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(six);
	    JButton seven = new JButton("7");
	    seven.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(seven);
	    JButton eight = new JButton("8");
	    eight.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(eight);
	    JButton nine = new JButton("9");
	    nine.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(nine);
	    JButton zero = new JButton("0");
	    zero.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(zero);
	    JButton dash = new JButton("-");
	    dash.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(dash);
	    JButton plus = new JButton("+");
	    plus.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(plus);
	    JButton backSpace = new JButton("Backspace");
	    backSpace.setPreferredSize(new Dimension(100, 50));
	    wholePanel.add(backSpace);
	    JButton tab = new JButton("Tab");
	    tab.setPreferredSize(new Dimension(80, 50));
	    wholePanel.add(tab);
	    JButton q = new JButton("Q");
	    q.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(q);
	    JButton w = new JButton("W");
	    w.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(w);
	    JButton e = new JButton("E");
	    e.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(e);
	    JButton r = new JButton("R");
	    r.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(r);
	    JButton t = new JButton("T");
	    t.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(t);
	    JButton y = new JButton("Y");
	    y.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(y);
	    JButton u = new JButton("U");
	    u.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(u);
	    JButton i = new JButton("I");
	    i.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(i);
	    JButton o = new JButton("O");
	    o.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(o);
	    JButton p = new JButton("P");
	    p.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(p);
	    JButton leftBracket = new JButton("[");
	    leftBracket.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(leftBracket);
	    JButton rightBracket = new JButton("]");
	    rightBracket.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(rightBracket);
	    JButton backSlash = new JButton("\\");
	    backSlash.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(backSlash);
	    JButton caps = new JButton("Caps");
	    caps.setPreferredSize(new Dimension(80, 50));
	    wholePanel.add(caps);
	    JButton a = new JButton("A");
	    a.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(a);
	    JButton s = new JButton("S");
	    s.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(s);
	    JButton d = new JButton("D");
	    d.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(d);
	    JButton f = new JButton("F");
	    f.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(f);
	    JButton g = new JButton("G");
	    g.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(g);
	    JButton h = new JButton("H");
	    h.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(h);
	    JButton j = new JButton("J");
	    j.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(j);
	    JButton k = new JButton("K");
	    k.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(k);
	    JButton l = new JButton("L");
	    l.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(l);
	    JButton colon = new JButton(":");
	    colon.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(colon);
	    JButton doubleQuotes = new JButton("\"");
	    doubleQuotes.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(doubleQuotes);
	    JButton enter = new JButton("Enter");
	    enter.setPreferredSize(new Dimension(100, 50));
	    wholePanel.add(enter);
	    JButton shift = new JButton("Shift");
	    shift.setPreferredSize(new Dimension(100, 50));
	    wholePanel.add(shift);
	    JButton z = new JButton("Z");
	    z.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(z);
	    JButton x = new JButton("X");
	    x.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(x);
	    JButton c = new JButton("C");
	    c.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(c);
	    JButton v = new JButton("V");
	    v.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(v);
	    JButton b = new JButton("B");
	    b.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(b);	    
	    JButton n = new JButton("N");
	    n.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(n);	    
	    JButton m = new JButton("M");
	    m.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(m);	    
	    JButton comma = new JButton(",");
	    comma.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(comma);	    
	    JButton dot = new JButton(".");
	    dot.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(dot);	    
	    JButton questionMark = new JButton("?");
	    questionMark.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(questionMark);	    
	    wholePanel.add(Box.createRigidArea(new Dimension(20, 0)));	    
	    JButton up = new JButton("^");
	    up.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(up);	    
	    wholePanel.add(Box.createRigidArea(new Dimension(200, 0)));	    
	    JButton space = new JButton("                                ");
	    space.setPreferredSize(new Dimension(330, 50));
	    wholePanel.add(space);	    
	    wholePanel.add(Box.createRigidArea(new Dimension(135, 0)));	    
	    JButton left = new JButton("<");
	    left.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(left);	    
	    JButton down = new JButton("V");
	    down.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(down);
	    JButton right = new JButton(">");
	    right.setPreferredSize(new Dimension(50, 50));
	    wholePanel.add(right);




  	    
        // Set up frame------------------------------------------------------------------------------------------------
		JFrame frame = new JFrame("Typing Tutor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up content pane
        
        //frame.getContentPane().add(wholePanel);
        frame.add(wholePanel);
        
        //Display window
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(885, 700);
        frame.setLocationRelativeTo(null);
        //-------------------------------------------------------------------------------------------------------------
        
        
  	    
        
        tilde.addMouseListener(new MouseAdapter() {
        	@Override
            public void mousePressed(MouseEvent event) {
        		int button = event.getButton();
        		if(button == MouseEvent.BUTTON1) textArea.append("~");
            }

            @Override
            public void mouseReleased(MouseEvent event) {
            	int button = event.getButton();
            	//if(button == MouseEvent.BUTTON1) textArea.setCaretPosition(textArea.getDocument().getLength());
            	if(button == MouseEvent.BUTTON1) {
            		textArea.getCaret().setVisible(true);
            		textArea.setCaretPosition(textArea.getDocument().getLength());
            		
            	}
            	//int len = textArea.getDocument().getLength();
                //textArea.setCaretPosition(len);
            }
        });
        
        
        
        textArea.addKeyListener(new KeyListener() {
        	
        	
        	@Override
        	public void keyPressed(KeyEvent event) {
        		int keyCode = event.getKeyCode();
        		if(keyCode == KeyEvent.VK_BACK_QUOTE) tilde.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_1) one.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_2) two.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_3) three.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_4) four.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_5) five.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_6) six.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_7) seven.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_8) eight.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_9) nine.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_0) zero.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_MINUS) dash.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_EQUALS) plus.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_BACK_SPACE) backSpace.setBackground(Color.LIGHT_GRAY);
        		
        		else if(keyCode == KeyEvent.VK_TAB) tab.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_Q) q.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_W) w.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_E) e.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_R) r.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_T) t.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_Y) y.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_U) u.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_I) i.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_O) o.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_P) p.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_OPEN_BRACKET) leftBracket.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_CLOSE_BRACKET) rightBracket.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_BACK_SLASH) backSlash.setBackground(Color.LIGHT_GRAY);
        		
        		else if(keyCode == KeyEvent.VK_CAPS_LOCK) caps.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_A) a.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_S) s.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_D) d.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_F) f.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_G) g.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_H) h.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_J) j.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_K) k.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_L) l.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_SEMICOLON) colon.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_QUOTE) doubleQuotes.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_ENTER) enter.setBackground(Color.LIGHT_GRAY);
        		
        		else if(keyCode == KeyEvent.VK_SHIFT) shift.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_Z) z.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_X) x.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_C) c.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_V) v.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_B) b.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_N) n.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_M) m.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_COMMA) comma.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_PERIOD) dot.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_SLASH) questionMark.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_UP) up.setBackground(Color.LIGHT_GRAY);
        		
        		else if(keyCode == KeyEvent.VK_SPACE) space.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_LEFT) left.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_DOWN) down.setBackground(Color.LIGHT_GRAY);
        		else if(keyCode == KeyEvent.VK_RIGHT) right.setBackground(Color.LIGHT_GRAY);
        	}
        	
        	@Override
        	public void keyReleased(KeyEvent event) {
        		int keyCode = event.getKeyCode();
        		if(keyCode == KeyEvent.VK_BACK_QUOTE) tilde.setBackground(null);
        		else if(keyCode == KeyEvent.VK_1) one.setBackground(null);
        		else if(keyCode == KeyEvent.VK_2) two.setBackground(null);
        		else if(keyCode == KeyEvent.VK_3) three.setBackground(null);
        		else if(keyCode == KeyEvent.VK_4) four.setBackground(null);
        		else if(keyCode == KeyEvent.VK_5) five.setBackground(null);
        		else if(keyCode == KeyEvent.VK_6) six.setBackground(null);
        		else if(keyCode == KeyEvent.VK_7) seven.setBackground(null);
        		else if(keyCode == KeyEvent.VK_8) eight.setBackground(null);
        		else if(keyCode == KeyEvent.VK_9) nine.setBackground(null);
        		else if(keyCode == KeyEvent.VK_0) zero.setBackground(null);
        		else if(keyCode == KeyEvent.VK_MINUS) dash.setBackground(null);
        		else if(keyCode == KeyEvent.VK_EQUALS) plus.setBackground(null);
        		else if(keyCode == KeyEvent.VK_BACK_SPACE) backSpace.setBackground(null);
        		
        		else if(keyCode == KeyEvent.VK_TAB) tab.setBackground(null);
        		else if(keyCode == KeyEvent.VK_Q) q.setBackground(null);
        		else if(keyCode == KeyEvent.VK_W) w.setBackground(null);
        		else if(keyCode == KeyEvent.VK_E) e.setBackground(null);
        		else if(keyCode == KeyEvent.VK_R) r.setBackground(null);
        		else if(keyCode == KeyEvent.VK_T) t.setBackground(null);
        		else if(keyCode == KeyEvent.VK_Y) y.setBackground(null);
        		else if(keyCode == KeyEvent.VK_U) u.setBackground(null);
        		else if(keyCode == KeyEvent.VK_I) i.setBackground(null);
        		else if(keyCode == KeyEvent.VK_O) o.setBackground(null);
        		else if(keyCode == KeyEvent.VK_P) p.setBackground(null);
        		else if(keyCode == KeyEvent.VK_OPEN_BRACKET) leftBracket.setBackground(null);
        		else if(keyCode == KeyEvent.VK_CLOSE_BRACKET) rightBracket.setBackground(null);
        		else if(keyCode == KeyEvent.VK_BACK_SLASH) backSlash.setBackground(null);
        		
        		else if(keyCode == KeyEvent.VK_CAPS_LOCK) caps.setBackground(null);
        		else if(keyCode == KeyEvent.VK_A) a.setBackground(null);
        		else if(keyCode == KeyEvent.VK_S) s.setBackground(null);
        		else if(keyCode == KeyEvent.VK_D) d.setBackground(null);
        		else if(keyCode == KeyEvent.VK_F) f.setBackground(null);
        		else if(keyCode == KeyEvent.VK_G) g.setBackground(null);
        		else if(keyCode == KeyEvent.VK_H) h.setBackground(null);
        		else if(keyCode == KeyEvent.VK_J) j.setBackground(null);
        		else if(keyCode == KeyEvent.VK_K) k.setBackground(null);
        		else if(keyCode == KeyEvent.VK_L) l.setBackground(null);
        		else if(keyCode == KeyEvent.VK_SEMICOLON) colon.setBackground(null);
        		else if(keyCode == KeyEvent.VK_QUOTE) doubleQuotes.setBackground(null);
        		else if(keyCode == KeyEvent.VK_ENTER) enter.setBackground(null);
        		
        		else if(keyCode == KeyEvent.VK_SHIFT) shift.setBackground(null);
        		else if(keyCode == KeyEvent.VK_Z) z.setBackground(null);
        		else if(keyCode == KeyEvent.VK_X) x.setBackground(null);
        		else if(keyCode == KeyEvent.VK_C) c.setBackground(null);
        		else if(keyCode == KeyEvent.VK_V) v.setBackground(null);
        		else if(keyCode == KeyEvent.VK_B) b.setBackground(null);
        		else if(keyCode == KeyEvent.VK_N) n.setBackground(null);
        		else if(keyCode == KeyEvent.VK_M) m.setBackground(null);
        		else if(keyCode == KeyEvent.VK_COMMA) comma.setBackground(null);
        		else if(keyCode == KeyEvent.VK_PERIOD) dot.setBackground(null);
        		else if(keyCode == KeyEvent.VK_SLASH) questionMark.setBackground(null);
        		else if(keyCode == KeyEvent.VK_UP) up.setBackground(null);
        		
        		else if(keyCode == KeyEvent.VK_SPACE) space.setBackground(null);
        		else if(keyCode == KeyEvent.VK_LEFT) left.setBackground(null);
        		else if(keyCode == KeyEvent.VK_DOWN) down.setBackground(null);
        		else if(keyCode == KeyEvent.VK_RIGHT) right.setBackground(null);
        	}
        	
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        	}
        });
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
        String face = e.getActionCommand();
        //System.out.println(face + " was clicked");
        textArea.setText(face);
    }
	
	
}

	
