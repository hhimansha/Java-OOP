package lab5_exe03;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int maxSubjects;
		int [] marks = new int[5];
		int total = 0;
		double avg;
		
		try {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter number of maximum subjects: ");
			maxSubjects = scan.nextInt();
			
			for (int i=1; i<=maxSubjects; i++) {
				System.out.print("Enter marks " + i + ":");
				marks[i] = scan.nextInt();
				total += marks[i]; 
			}
			
			avg = total / maxSubjects;
			System.out.println("Average marks is: " + avg);
		

		} catch (java.util.InputMismatchException e) {
            System.err.println("Please enter valid integers for marks.");
        } catch (ArithmeticException e) {
            System.err.println("Division by zero error.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds.");
		}
		finally {
			System.out.println("This code will be gurrentied to run");
		}
		
		System.out.println("The end");
	}
}
