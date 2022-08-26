package java_data_types;

public class Day4_anestedif_Example2 {

	public static void main(String[] args) {
		// If the person's age is less than 18 he can apply for learner
		// and if the age is greater that 18 then he can apply for driving license
		// if the age is greater than 21 he can start working
		// if the age is greater than 65 he is ready to retire

		int age = 19;
		String name = "John";

		if (age < 18) {
			System.out.println(name + " can apply for learner's permit.");
		} else {
			System.out.println(name + " is greater than 18, He can apply for driving license");
			if (age < 21) {
				System.out.println(name + " is less than 21. you");
			} else {
				System.out.println(name + " is greater than 21. you can start working");
				if (age < 65) {
					System.out.println(name + "can contiue to work. ");
				} else {
					System.out.println(name + "is ready retire. ");
				}
			}
			
			
			
			
			
			
			// If the Jackson age is less than 45 he is qualify for presidency 
			// and if the age is greater that 35 then he is qualify for presidency
			// if the age is less than 35 he is not qualify for presidency

			if (age < 45) {
				System.out.println(name + " he is qualify for presidency ");
			} else {
				System.out.println(name + " is less than 45. he is qualify for presidency ");
				if (age < 35) {
					System.out.println(name + " is greater than 35. he is qualify for presidency ");
				} else {
					System.out.println(name + " is less than 35. he is not qualify for presidency ");
					}
				}
			}

		}

	}

