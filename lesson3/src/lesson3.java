package lesson3;

import javax.swing.*;

public class lesson3 {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("Окно 1");
		window.setBounds(10, 20, 500, 300);
		window.setVisible(true);
		
		JFrame window1 = new JFrame();
		window1.setTitle("Окно 2");
		window1.setBounds(10, 20, 500, 300);
		window1.setVisible(true);
		
		/*for (int i = 0; i <= 5; i = i + 1){
			System.out.println("Java");
		}
		int x = 1;
		int y = 2;
		
		if (x < y) {
			System.out.println("Математика - это чудо");
		}
		else {
			System.out.println("Не люблю математику");
		}
		*/
	}
}
