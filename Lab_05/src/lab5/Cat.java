package lab5;

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	public String speak() {
		return "Meow Meow";
	}
	
	public Cat() {
		super();
		System.out.println("Cat constructor called");
	}
}
