package lab5;

class ToyCat extends Cat {
	String manufacturer;

	public ToyCat(String name, String manufacturer) {
		super(name);
		this.manufacturer = manufacturer;
	}

	public void display() {
		super.display();
		System.out.println("I am from " + manufacturer + ".");
	}
	
	public ToyCat() {
		super();
		System.out.println("ToyCat constructor called");
	}
}
