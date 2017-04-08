package game;

// ����������� ����������� ���������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ����� ����, � ������� ��������� ������� ����
public class window extends JFrame {
	
	// �������� ���������� ������ - ������� ����
	private field game_field;
	
	// ���������� ������� ������� �� �������
	private class myKey implements KeyListener {
	
		// �����, ������� ����������� ��� ������� �� �������
		public void keyPressed(KeyEvent e) {
			
			// ��������� ���� ������� �������
			int key_ = e.getKeyCode();
			
			// ��� ������� ������� Escape (27) - ����� �� ���������
			if (key_ == 27) System.exit(0);
			
			// ���� ������ ������� ������� �����
			else if (key_ == 37) {
				
				// ����� �� ���� ����� �� ����� ����
				if (game_field.x - 30 > -48) {
					game_field.x -= 30;
				}
				else {
					game_field.x = 752;
				}
			}
			
			// ���� ������ ������� ������� ������
			else if (key_ == 39) {
				// ����� �� ���� ����� �� ������ ����
				if (game_field.x + 30 < 752) {
					game_field.x += 30;
				}
				else {
					game_field.x = -48;
				}
			}
		}
		
		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	}
	
	// ����������� ������
	public window (int complexity) {
		
		// ����������� ����������� ������� ��� ���������� � ����
		addKeyListener(new myKey());
		
		// ��������� ���������� ����
		setFocusable(true);
		
		// ������� �������� � ��������� ����
		setBounds(0, 0, 800, 600);
		
		// ������� �������� ����
		setTitle("���� ������");
		
		// �������� ������� ������� ����
		game_field = new field(complexity);
		
		// ������������ (��������) ������ - �������� ���� � ����
		Container cont = getContentPane();
		cont.add(game_field);
		
		// ������ ���� �������
		setVisible(true);
	}
}
