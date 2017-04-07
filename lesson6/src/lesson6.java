package lesson6;

import javax.imageio.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class lesson6 {

	public static void main(String[] args) {
		myFrame window = new myFrame();
	}
}

class myFrame extends JFrame {
	public myFrame() {
		myPanel np = new myPanel();
		Container cont = getContentPane();
		cont.add(np);
		setBounds(10, 10, 800, 600);
		setVisible(true);
	}
}

class myPanel extends JPanel {
	private Image img;
	
	private int x = 0, y = 0;
	
	private int direction = 2;
	
	private class myKey implements KeyListener {
		public void keyPressed (KeyEvent e) {
			int key_ = e.getKeyCode();
			
			if (key_ == 37) direction = 0;
			if (key_ == 38) direction = 1;
			if (key_ == 39) direction = 2;
			if (key_ == 40) direction = 3;
		}
		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
		
	}
	
	public myPanel() {
		
		addKeyListener(new myKey());
		setFocusable(true);
		
		Timer nt = new Timer(50, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (direction == 0) x--;
				if (direction == 1) y--;
				if (direction == 2) x++;
				if (direction == 3) y++;
				repaint();
			}
		});
		
		nt.start();
		
		try {
			img = ImageIO.read(new File("C:\\Users\\Lehrer\\workspace\\picture.jpg"));
		}
		catch (IOException exp) {}
	}
	
	public void paintComponent(Graphics gr) {
		gr.clearRect(x - 1, y - 1, img.getWidth(null) + 1, img.getHeight(null) + 1);
		gr.drawImage(img, x, y, null);
	}
}