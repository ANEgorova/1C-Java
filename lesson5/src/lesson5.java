package lesson5;

import javax.swing.*;
import java.awt.*;

public class lesson5 {

	public static void main(String[] args) {
		Animal pigeon = new Animal();
		pigeon.weight = 5;
		pigeon.eat(1);
		System.out.println(pigeon.weight);

		pigeon.croak();
	}

}

class Animal {
	int weight = 10;
	
	void eat(int food) {
		weight = weight + food;
	}
	
	void croak() {
		System.out.println(" ‡‡‡");
	}
}