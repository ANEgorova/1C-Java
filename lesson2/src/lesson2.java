package lesson2;

import javax.swing.*; // ����������� ���������� ��� ������ � ������

public class lesson2 {

	public static void main(String[] args) {
		
		// ������������ ������� ����� print() � println()
		System.out.println("Hello1");
		
		System.out.print("Hello2");
		
		System.out.print("Hello3");
		
		System.out.println("Hello4");
		
		System.out.print("Hello5");
		
		// ����� ��� �������� ���� � ���������� ���� ������, �������� � ����������, �.�. "������, ������"
		JOptionPane.showMessageDialog(null, "������, ������!");
		
		// �������� ������ ��� int (������� �����)
		int myvariable; 

		// � ������ �������� �������� 42
		myvariable = 42;

		// �������� �������� � ������ �� 12
		myvariable = 12;
		
		// ����� ���������� (������ ����� ���������� � �������, ������ �������������� � ��������� �����)
		int Alpha_beta1 = 2;
		
		// ������ �������� ���������� myvariable � ���������� ����
		System.out.println(myvariable);
		
		// ������ ���� � ��������� ����������
		JOptionPane.showMessageDialog(null, myvariable);
		
		// ������� ������, ����� ������� ����� ���� ����������
		int summa = myvariable + Alpha_beta1;
		
		// ���������� ������� ���� ����������
		int different = myvariable - Alpha_beta1;
		
		// � �������� � ���������� ������ ���������� ����� ������ ���������
		System.out.println(myvariable - Alpha_beta1);
		
		// � ���� ��������� ��������� ��������� � ����������
		JOptionPane.showMessageDialog(null, myvariable * Alpha_beta1 + 12);
		
		// ����� ��� ������ ��� ������������ �����
		float delenie = 5 / 3;
		
		System.out.println(delenie);
		
		// ��������� ������ ��� �������, �������� ��� char
		char symbol;

		// �������� � ������ '+', ����� ������ ����� ������
		symbol = '+';
		
		// �������� ������, �������� �������� ��� String ������� � ������� �����
		String mystring = "123__+Hello!";
		
	}

}
