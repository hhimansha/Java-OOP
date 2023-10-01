package lab04;

public class StudentApp {

	public static void main(String[] args) {
		//Create an array to store 5 Student objects
		Student[] students = new Student[5];
		
		students[0] = new Student("Haritha Himansha", "Software Engineering", "0723941066");
		students[1] = new Student("Jane Smith", "Mathematics", "987-654-3210");
        students[2] = new Student("Alice Johnson", "Physics", "555-555-5555");
        students[3] = new Student("Bob Wilson", "History", "777-777-7777");
        students[4] = new Student("Eva Williams", "Biology", "888-888-8888");
	
        for (Student stud : students) {
            stud.print(); // Call the print method to display student details
            System.out.println(); // Add an empty line for separation
        }
	}

}
