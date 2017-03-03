package lesson4;

public class lesson4_extends {
	public static void main(String[] args) {
		Elephant my_slon = new Elephant();
	}
}

class Animal {
	int massa;
	Boolean can_fly;
	Boolean overland;
	String name;
}

class Elephant extends Animal {
	int trunk_length;
}

class Eagle extends Animal {
	int beak_length;
}
