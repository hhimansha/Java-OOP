package lab5_exe02;

class Main {
	public static void main(String[] args) {
		ICompute obj1 = new Person("Danushka", 40000, 1000, 5, 0);
		obj1.calculate();
		obj1.display();
		
		ICompute obj2 = new Box(10, 20, 30, 0);
		obj2.calculate();
		obj2.display();
	}
}
