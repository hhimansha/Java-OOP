package lab5_exe02;

public class Box implements ICompute {
	private int length, width, height;
	private int volume;
	
	public Box(int length, int width, int height, int volume) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volume = volume;
	}

	@Override
	public void calculate() {
		volume = length * width * height;
		
	}

	@Override
	public void display() {
		System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Length: " + this.length);
        System.out.println("Volume: " + this.volume);
		
	}
}
