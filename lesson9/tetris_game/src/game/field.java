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
	
	// ����������� ������
	public field(int complexity) {
		
		// C��������� � ���� ������ ��������� ����
		this.complexity = complexity;
		
		// �������� �������
		try {
			hat = ImageIO.read(new File("C:\\Users\\Alyona\\workspace\\game\\src\\hat.png"));
		}
		catch (IOException ex) {
			// ����� ��������� � ����������� ����� ������
			System.err.println("�� ������� ������� �������� hat.png");
		}
		
		try {
			background = ImageIO.read(new File("C:\\Users\\Alyona\\workspace\\game\\src\\background.png"));
		}
		catch (IOException ex) {
			// ����� ��������� � ����������� ����� ������
			System.err.println("�� ������� ������� �������� background.png");
		}
		
		// �������� 7 ����������� �������� � ������
		all_presents = new present[7];
		for (int i = 0; i < 7; i++) {
			try {
				all_presents[i] = new present(ImageIO.read(new File("C:\\Users\\Alyona\\workspace\\game\\src\\fish" + i + ".png")));
			}
			
			catch (IOException ex) {}
		}
		
		// �������� �������, ������� ����� ��� � 3 ������� ��������� ������� � ��������� �� �� ����
		Timer timerUpdate = new Timer(3000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ����� ��� �������� � ���������� �������� �� ������� ����
				updateStart();
			}
		});
		
		// ������� ������� 
		timerUpdate.start();
				
		// �������� �������, ������� ����� �������������� ������� ���� 20 ��� � �������
		Timer timerDraw = new Timer(50, new ActionListener() {
			
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
		}
	}
	
	// ����� �������� � ���������� �������� �� ������� ����
	private void updateStart() {
		
		// ���������� ��� �������� ���������� �������� �� ������� ����
		int amount = 0;
		
		// ���� �������� ���� �������� �������
		for (int i = 0; i < 7; i++) {
			
		}
	}
	
}
