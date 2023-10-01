package lab5;

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	public String speak() {
		return "Bow Wow";
	}
	
	public Dog() {
		super();
		System.out.println("Dog constructor called");
	}
	
}