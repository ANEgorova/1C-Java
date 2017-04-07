package lesson5;

import javax.swing.*;
import java.awt.*;

public class lesson5_draw {

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
	public void paintComponent(Graphics gr) {
		gr.setColor(Color.BLUE);
		gr.drawRect(10, 10, 300, 400);
		gr.fillRect(10, 10, 200, 300);
		
		gr.setColor(Color.GREEN);
		gr.drawLine(50, 50, 700, 700);
		
		gr.setColor(Color.ORANGE);
		gr.fillOval(100, 100, 500, 500);
		
		gr.setColor(Color.YELLOW);
		for (int i = 0; i < 10; i = i + 1) {
			gr.fillRect(10 * i, 10 * i, 50 * i, 50 * i);
		}
	}
}