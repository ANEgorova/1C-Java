package game;

// Подключение необходимых библиотек
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Класс окна, в котором размещено игровое поле
public class window extends JFrame {
	
	// Закрытая переменная класса - игровое поле
	private field game_field;
	
	// Обработчик событий нажатий на клавиши
	private class myKey implements KeyListener {
	
		// Метод, который срабатывает при нажатии на клавиши
		public void keyPressed(KeyEvent e) {
			
			// Получение кода нажатой клавиши
			int key_ = e.getKeyCode();		
		}
		
		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	}
	
	// Конструктор класса
	public window () {
		
		// Подключение обработчика событий для клавиатуры к окну
		addKeyListener(new myKey());
		
		// Установка активности окна
		setFocusable(true);
		
		// Задание размеров и положения окна
		setBounds(0, 0, 800, 600);
		
		// Задание заголвка окна
		setTitle("Игра Тетрис");
		
		// Создание объекта игровое поле
		game_field = new field();
		
		// Прикрепление (вложение) панели - игрового поля в окно
		Container cont = getContentPane();
		cont.add(game_field);
		
		// Делаем окно видимым
		setVisible(true);
	}
}
