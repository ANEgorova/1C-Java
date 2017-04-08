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
	
	// Переменная сложности
	private int complexity;
	
	// Массив подарков
	private present[] all_presents;
	
	// Конструктор класса
	public field(int complexity) {
		
		// Cохранение в поля класса сложности игры
		this.complexity = complexity;
		
		// Загрузка графики
		try {
			hat = ImageIO.read(new File("C:\\Users\\Alyona\\workspace\\game\\src\\hat.png"));
		}
		catch (IOException ex) {
			// Вывод сообщения в специальный поток ошибок
			System.err.println("Не удалось открыть картинку hat.png");
		}
		
		try {
			background = ImageIO.read(new File("C:\\Users\\Alyona\\workspace\\game\\src\\background.png"));
		}
		catch (IOException ex) {
			// Вывод сообщения в специальный поток ошибок
			System.err.println("Не удалось открыть картинку background.png");
		}
		
		// Загрузка 7 изображений подарков в массив
		all_presents = new present[7];
		for (int i = 0; i < 7; i++) {
			try {
				all_presents[i] = new present(ImageIO.read(new File("C:\\Users\\Alyona\\workspace\\game\\src\\fish" + i + ".png")));
			}
			
			catch (IOException ex) {}
		}
		
		// Создание таймера, который будет раз в 3 секунды проверять подарки и добавлять их на поле
		Timer timerUpdate = new Timer(3000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Метод для проверки и добавления подарков на игровое поле
				updateStart();
			}
		});
		
		// Запуска таймера 
		timerUpdate.start();
				
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
		
		// Перерисовка панели, на которой располагается графика	
		super.paintComponent(gr);
		
		// Стирает всё, что было на экране до и рисует фон
		gr.drawImage(background, 0, 0, null);
		
		// Стирает всё, что было на экране до и рисует шапку
		gr.drawImage(hat, x, 465, null);
		
		// Цикл, который отображает подарки на игровом поле и проверяет пропущенные подарки
		for (int i = 0; i < 7; i++) {
			
			// Отображение подарка
			all_presents[i].draw(gr);
		}
	}
	
	// Метод проверки и добавления подарков на игровое поле
	private void updateStart() {
		
		// Переменная для подсчета количества подарков на игровом поле
		int amount = 0;
		
		// Цикл перебора всех подарков массива
		for (int i = 0; i < 7; i++) {
			
		}
	}
	
}
