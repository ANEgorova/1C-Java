package lesson1;

import javax.swing.*; // ����������� ���������� ��� ������ � ������

public class lesson1 { // �������� �������� ������

	public static void main(String[] args) { // �������� �������� ������ ���������, � �������� ����������� ���������
		
		// ������� ������ � ���������� ����
		// ���, ��� ��������� � ������� ���������� ����������� �������
		System.out.printnl("������, ������!");
		
		// ���������� ���������� � ������ window � ����� JFrame
		JFrame window = new JFrame();
		
		// ��������� ��������� ����
		window.setTitle("������, ������!");

		/* ��������� ��������� ���� � ��� �������� (� ��������)	
		10 - ������ �����, 20 - ������ ������, 500 - ������, 300 - ������ */

		window.setBounds(10, 20, 500, 300);

		// ����� ���� �� �����
		window.setVisible(true);		
	}
}

