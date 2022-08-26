package java_data_types;

import java.util.Scanner;

public class Day08_Task {

	public static void main(String[] args) {

		// this is the object of the scanner class
		Scanner monthInput = new Scanner(System.in);
		for (int a = 0; a < 3; a++) {
			
			System.out.println("Enter the month you were born in :");
			String monthName = monthInput.next();
			if (monthName.equals("jan") || monthName.equals("Fab") || monthName.equals("Mar")) {
				System.out.println("Winter");
			} else if (monthName.equals("Apr") || monthName.equals("May") || monthName.equals("Jun")) {
				System.out.println("spring");
			} else if (monthName.equals("Jul") || monthName.equals("Aug") || monthName.equals("Sep")) {
				System.out.println("Summer");
			} else if (monthName.equals("Oct") || monthName.equals("Nov") || monthName.equals("Dec")) {
				System.out.println("Fall");
			} else {
				System.out.println("provid the valid month");

			}
		}

			Scanner weekInput = new Scanner(System.in);
			for (int i = 0; i < 4; i++) {
				System.out.println("Enter days of the week you work :");
				String weekName = weekInput.next();
				if (weekName.equalsIgnoreCase("Monday") || weekName.equalsIgnoreCase("Tuesday") || weekName.equalsIgnoreCase("Wednesday")) {
					System.out.println("Week1");
				} else if (weekName.equalsIgnoreCase("Thursday") || weekName.equalsIgnoreCase("Saturday")|| weekName.equalsIgnoreCase("Sunday")) {
					System.out.println("Week2");

				} else {
					System.out.println("provid the valid month");
					
					
					

				}

			}

		}
}