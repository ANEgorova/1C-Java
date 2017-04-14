package game;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

// ����� ������, ������� �������� ������� �����
public class field extends JPanel {
	
	// ��������� ���������� - �������� �����
	private Image hat;
	
	// ��������� ���������� - �������� ����
	private Image background;
	
	// ��������� ���������� - ���������� �����
	public int x;
	
	// ���������� ���������
	private int complexity;
	
	// ������ ��������
	private present[] all_presents;
	
	//����������� ��������� ����
	private Image game_over;
	
	// �������
	public Timer timerUpdate, timerDraw;
	
	// ����������� ������
	public field(int complexity) {
		
		// C��������� � ���� ������ ��������� ����
		this.complexity = complexity;
		
		// �������� �������
		try {
			hat = ImageIO.read(new File("./hat.png"));
		}
		catch (IOException ex) {
			// ����� ��������� � ����������� ����� ������
			System.err.println("�� ������� ������� �������� hat.png");
		}
		
		try {
			background = ImageIO.read(new File("./background.png"));
		}
		catch (IOException ex) {
			// ����� ��������� � ����������� ����� ������
			System.err.println("�� ������� ������� �������� background.png");
		}
		
		// �������� ����������� Game over
		try {
			game_over = ImageIO.read(new File("./game_over.png"));
		}
		catch (IOException ex) {
			// ����� ��������� � ����������� ����� ������
			System.err.println("�� ������� ������� �������� game_over.png");
		}
		
		// �������� 7 ����������� �������� � ������
		all_presents = new present[7];
		for (int i = 0; i < 7; i++) {
			try {
				all_presents[i] = new present(ImageIO.read(new File("./fish" + i + ".png")));
			}
			
			catch (IOException ex) {
				System.err.println("�� ������� ������� ����");
			}
		}
		
		// �������� �������, ������� ����� ��� � 3 ������� ��������� ������� � ��������� �� �� ����
		timerUpdate = new Timer(5000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ����� ��� �������� � ���������� �������� �� ������� ����
				updateStart();
			}
		});
		
		// ������� ������� 
		timerUpdate.start();
				
		// �������� �������, ������� ����� �������������� ������� ���� 20 ��� � �������
		timerDraw = new Timer(50, new ActionListener() {
			
			// ������ ������ ����������� ���� (paintComponent)
			public void actionPerformed (ActionEvent e) {
				repaint();
			}
		});
		
		// ������ ������� ��� �����������
		timerDraw.start();
	}
	
	// �����, ������� ������������ ����������� ������� �� ������
	public void paintComponent (Graphics gr) {
		
		// ����������� ������, �� ������� ������������� �������	
		super.paintComponent(gr);
		
		// ������� ��, ��� ���� �� ������ �� � ������ ���
		gr.drawImage(background, 0, 0, null);
		
		// ������� ��, ��� ���� �� ������ �� � ������ �����
		gr.drawImage(hat, x, 465, null);
		
		// ����, ������� ���������� ������� �� ������� ���� � ��������� ����������� �������
		for (int i = 0; i < 7; i++) {
			
			// ����������� �������
			all_presents[i].draw(gr);
			
			// ���� ������� �������
			if (all_presents[i].active == true) {
				
				// ���� ������� ������ ������ �������
				if ((all_presents[i].y + all_presents[i].img.getHeight(null)) >= 470) {
					
					// ���� ������� ��������
					if (Math.abs(all_presents[i].x - x) > 75) {
						
						// ����� �������� ��������� ����
						gr.drawImage(game_over, 300, 300, null);
						
						// ��������� ��������
						timerDraw.stop();
						timerUpdate.stop();
						
						// ���������� �����
						break;
					}
					
					// ������ ������� � �������� ����, ���� �� ������
					else {
						all_presents[i].active = false;
					}
				}
			}
		}
	}
	
	// ����� �������� � ���������� �������� �� ������� ����
	private void updateStart() {
		
		// ���������� ��� �������� ���������� �������� �� ������� ����
		int amount = 0;
		
		// ���� �������� ���� �������� �������
		for (int i = 0; i < 7; i++) {
			
			// ���� ������� �� �� ������� ����
			if (all_presents[i].active == false) {

				// ���� ������� ���������� �������� ����� ������ ���������
				if (amount < complexity) {
					all_presents[i].start();
					
					// ���������� �����
					break;
				}
			}
			
			// ������� �� ������� ����
			else amount++;
		}
	}
	
}
