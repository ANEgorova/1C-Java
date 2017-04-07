package game;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

// Класс панели, которая является игровым полем
public class field extends JPanel {
	
	// Приватная переменная - картинка шапки
	private Image hat;
	
	// Приватная переменная - картинка фона
	private Image background;
	
	// Публичная переменная - координата шапки
	public int x;
	
	// Конструктор класса
	public field() {
		
		// Загрузка графики
		try {
			hat = ImageIO.read(new File("tetris_game\\images\\hat.png"));
		}
		catch (IOException ex) {
			// Вывод сообщения в специальный поток ошибок
			System.err.println("Не удалось открыть картинку hat.png");
		}
		
		try {
			background = ImageIO.read(new File("tetris_game\\images\\background.png"));
		}
		catch (IOException ex) {
			// Вывод сообщения в специальный поток ошибок
			System.err.println("Не удалось открыть картинку background.png");
		}
		
		
		// Создание таймера, который будет перерисовывать игровое поле 20 раз в секунду
		Timer timerDraw = new Timer(50, new ActionListener() {
			
			// Запуск метода перерисовки поля (paintComponent)
			public void actionPerformed (ActionEvent e) {
				repaint();
			}
		});
		
		// Запуск таймера для перерисовки
		timerDraw.start();
	}
	
	// Метод, который отрисовывает графические объекты на панели
	public void paintComponent (Graphics gr) {
		
	}
	
}
