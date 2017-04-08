package game;

import javax.swing.*;

//главный класс игры
public class game_main {
	
	//главный метод, который запускает игру
	public static void main(String[] args) {
		
		// Вызов диалогового окна для ввода сложности игры
		String mesg = JOptionPane.showInputDialog(null, "Введите сложность игры от 1 до 7:", "Сложность игры", 1);
		
		// Сохраниение результатов выбора
		int complexity = mesg.charAt(0) - '0';
		
		// Проверка, что введена цифра от 1 до 7
		if ((complexity >= 1) && (complexity <= 7)) {
			
			// Создание окна, в котором находится игровое поле
			window main_window = new window(complexity);
		}
	}

}
