package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// create an object / instance of the class
		
		// clasname objectname = new class();
		Scanner getInput = new Scanner(System.in);
		// getInput in the object of the Scanner class.
		
		System.out.println("Enter the first value : ");
		// scanner class has methods which takes the int value as an input
		 int aa = getInput.nextInt(); // 4
		 
		 System.out.println("Enter teh second value : ");
		 int bb = getInput.nextInt(); // 5
		 
		 int cc = aa+bb;
		 
		 System.out.println("The sum is : "+cc);

	}

}
