package java_data_types;

public class Day15LocalVariable {

	public static void main(String[] args) {
		// local variable
		
		int age = 10;
		String name = "John";
		float temp = 45.88f;
		 System.out.println(age);
		 System.out.println(name);
		 System.out.println(temp);
		 
		 
		 Day15LocalVariable a = new Day15LocalVariable();
		 a.possible();
		 
		 if(true) {
			 // Local variable
			 
			 int b = 40;
			 System.out.println(b);
			 
		 }
	}
	public void possible( ) {
		// Local variable
		
		String enviroment = "qa.codegator.us";
		String username = "test@gmail.com";
		String password = "welcome";
		 
		System.out.println(enviroment);
		System.out.println(username);
		System.out.println(password);
	}
}
