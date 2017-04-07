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
		}
		
		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	}
	
	// ����������� ������
	public window () {
		
		// ����������� ����������� ������� ��� ���������� � ����
		addKeyListener(new myKey());
		
		// ��������� ���������� ����
		setFocusable(true);
		
		// ������� �������� � ��������� ����
		setBounds(0, 0, 800, 600);
		
		// ������� �������� ����
		setTitle("���� ������");
		
		// �������� ������� ������� ����
		game_field = new field();
		
		// ������������ (��������) ������ - �������� ���� � ����
		Container cont = getContentPane();
		cont.add(game_field);
		
		// ������ ���� �������
		setVisible(true);
	}
}
