package game;

import javax.swing.*;

//������� ����� ����
public class game_main {
	
	//������� �����, ������� ��������� ����
	public static void main(String[] args) {
		
		// ����� ����������� ���� ��� ����� ��������� ����
		String mesg = JOptionPane.showInputDialog(null, "������� ��������� ���� �� 1 �� 7:", "��������� ����", 1);
		
		// ����������� ����������� ������
		int complexity = mesg.charAt(0) - '0';
		
		// ��������, ��� ������� ����� �� 1 �� 7
		if ((complexity >= 1) && (complexity <= 7)) {
			
			// �������� ����, � ������� ��������� ������� ����
			window main_window = new window(complexity);
		}
	}

}
