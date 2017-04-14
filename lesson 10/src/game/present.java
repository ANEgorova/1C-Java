package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Класс, отвечающий за положение подарков на поле
public class present {

	// Изображение подарка
	public Image img;
	
	// Положение подарка на игровом поле
	public int x, y;
	
	// Переменная логического типа, показывающая активность подарка
	// true - есть на игровом поле, false - нет
	public Boolean active;
	
	// Таймер, отвечающий за движение подарка вниз
	Timer timerUpdate;
	
	// Конструктор класса
	public present(Image img) {
		
		// Создание и настройка таймера, отвечающего за движение подарка вниз
		timerUpdate = new Timer(300, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				down();
			}
		});
		
		// Передача изображения из круглых скобок параметра констуктора в переменную класса
		this.img = img;
		
		// Изначально подарок неактивен на поле
		this.active = false;
	}
	
	// Метод, выполняющий активизацию подарка на игровом поле
	// Выводит сверху подарок
	public void start() {
		
		// Запуск таймера
		timerUpdate.start();
		
		// Отступ сверху в пикселях
		y = 0;
		
		// Отступ слева в пикселях получается случайным образом то 0 до 700
		x = (int)(Math.random() * 700);
		
		// Подарок делаем активным на игровом поле
		active = true;
	}
	
	// Метод, осуществляющий движение подарка вниз
	public void down() {
		
		// Если подарок активен на игровом поле
		if (active == true) {
			
			// Увеличиваем отступ сверху
			y += 6;
			
			// Если подарок достиг нижней границы
			if (y + img.getHeight(null) >= 470) {
				timerUpdate.stop();
			}
		}
	}	
	
	// Метод, выполнящий отрисовку подарка на игровом поле, если он активек
	public void draw(Graphics gr) {
		if (active == true) {
			gr.drawImage(img, x, y, null);
		}
	}
}
