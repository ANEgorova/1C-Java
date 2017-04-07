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
	
	// ����������� ������
	public field() {
		
		// �������� �������
		try {
			hat = ImageIO.read(new File("tetris_game\\images\\hat.png"));
		}
		catch (IOException ex) {
			// ����� ��������� � ����������� ����� ������
			System.err.println("�� ������� ������� �������� hat.png");
		}
		
		try {
			background = ImageIO.read(new File("tetris_game\\images\\background.png"));
		}
		catch (IOException ex) {
			// ����� ��������� � ����������� ����� ������
			System.err.println("�� ������� ������� �������� background.png");
		}
		
		
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
		
	}
	
}
