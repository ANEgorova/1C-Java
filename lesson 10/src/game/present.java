package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// �����, ���������� �� ��������� �������� �� ����
public class present {

	// ����������� �������
	public Image img;
	
	// ��������� ������� �� ������� ����
	public int x, y;
	
	// ���������� ����������� ����, ������������ ���������� �������
	// true - ���� �� ������� ����, false - ���
	public Boolean active;
	
	// ������, ���������� �� �������� ������� ����
	Timer timerUpdate;
	
	// ����������� ������
	public present(Image img) {
		
		// �������� � ��������� �������, ����������� �� �������� ������� ����
		timerUpdate = new Timer(300, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				down();
			}
		});
		
		// �������� ����������� �� ������� ������ ��������� ����������� � ���������� ������
		this.img = img;
		
		// ���������� ������� ��������� �� ����
		this.active = false;
	}
	
	// �����, ����������� ����������� ������� �� ������� ����
	// ������� ������ �������
	public void start() {
		
		// ������ �������
		timerUpdate.start();
		
		// ������ ������ � ��������
		y = 0;
		
		// ������ ����� � �������� ���������� ��������� ������� �� 0 �� 700
		x = (int)(Math.random() * 700);
		
		// ������� ������ �������� �� ������� ����
		active = true;
	}
	
	// �����, �������������� �������� ������� ����
	public void down() {
		
		// ���� ������� ������� �� ������� ����
		if (active == true) {
			
			// ����������� ������ ������
			y += 6;
			
			// ���� ������� ������ ������ �������
			if (y + img.getHeight(null) >= 470) {
				timerUpdate.stop();
			}
		}
	}	
	
	// �����, ���������� ��������� ������� �� ������� ����, ���� �� �������
	public void draw(Graphics gr) {
		if (active == true) {
			gr.drawImage(img, x, y, null);
		}
	}
}
