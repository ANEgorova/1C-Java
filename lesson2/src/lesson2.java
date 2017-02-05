package lesson2;

import javax.swing.*; // Подключение библиотеки для работы с окнами

public class lesson2 {

	public static void main(String[] args) {
		
		// Тестирование разницы между print() и println()
		System.out.println("Hello1");
		
		System.out.print("Hello2");
		
		System.out.print("Hello3");
		
		System.out.println("Hello4");
		
		System.out.print("Hello5");
		
		// Метод для открытия окна и написаания туда строки, заданную в аргументах, т.е. "Привет, друзья"
		JOptionPane.showMessageDialog(null, "Привет, друзья!");
		
		// Выделила память для int (создала ячеку)
		int myvariable; 

		// В ячейку положили значение 42
		myvariable = 42;

		// Поменяли значение в ячейке на 12
		myvariable = 12;
		
		// Новая переменная (пример имени переменной с цифрами, нижним подчеркиванием и заглавной буквы)
		int Alpha_beta1 = 2;
		
		// Вывели значение переменной myvariable в консольное окно
		System.out.println(myvariable);
		
		// Вывели окно с значением переменной
		JOptionPane.showMessageDialog(null, myvariable);
		
		// Создали ячейку, чтобы хранить сумму двух переменным
		int summa = myvariable + Alpha_beta1;
		
		// Аналогично разница двух переменных
		int different = myvariable - Alpha_beta1;
		
		// В Функциях в аргументах вместо переменных можно писать выражения
		System.out.println(myvariable - Alpha_beta1);
		
		// В окне выведется результат выражения в аргументах
		JOptionPane.showMessageDialog(null, myvariable * Alpha_beta1 + 12);
		
		// Новый тип данных для вещественных чисел
		float delenie = 5 / 3;
		
		System.out.println(delenie);
		
		// Выделение памяти для символа, имеющего тип char
		char symbol;

		// Положили в ячейку '+', можно класть любой символ
		symbol = '+';
		
		// Создание строки, обратите внимание тип String пищется с большой буквы
		String mystring = "123__+Hello!";
		
	}

}
