package lab5_exe02;

public class Person implements ICompute{
	
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	public Person(String name, double basicSal, double otRate, double otHrs, double netSal) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		this.netSal = netSal;
	}
	
	public void calculate() {
		netSal = basicSal + (otRate * otHrs);
	}
	
	 public void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("OT Rate: " + otRate);
        System.out.println("OT Hours: " + otHrs);
        System.out.println("Net Salary: " + netSal);
    }

}
