package lab5;

class Main {
	public static void main(String[] args) {
		
		Cat mycat = new Cat("Micky");
		mycat.display();
		Dog mydog = new Dog("Rover");
		mydog.display();
		ToyCat mytoy = new ToyCat("kittie", "Toysrus");
		mytoy.display();
		
		ToyCat defaultToyCat = new ToyCat();
		
		
	}
}
