package java_data_types;

public class Day04_Nestedif {

	public static void main(String[] args) {
		// VP 200000 Sr/Jr, IT_PROG 120000, AMALYST 80000
		String title = "Developer";
		String role = "junior";
		
		if (title == "vp") {
			System.out.println("Vice President");
			if (role == "junior") {
				System.out.println("Salary is $200,000");
			}else if (role == "senior") {
				System.out.println("Salary is $250,000");
			} else {
				System.out.println("The role dose not exist.");
			}
		} else if (title == "It_PROG") {
			System.out.println("IT Programmer");
			
			// There are not condition for role ?
			if (title == "juior") {
				System.out.println("The salary is $120,000");
				}else if (role == "senior") {
					System.out.println("Salary is $170,000");
				} else {
					System.out.println("The role dose not exist.");
				}
			
		} else if (title == "ANALYST") {
				System.out.println("System analyst");
				
			if (title == "juior") {
					System.out.println("The salary is $80,000");
					}else if (role == "senior") {
						System.out.println("Salary is $130,000");
					} else {
						System.out.println("The role dose not exist.");
					}
		}
		

	}

}
