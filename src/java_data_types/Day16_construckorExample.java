package java_data_types;

public class Day16_construckorExample {

	public static void main(String[] args) {
		
		// instantiating
		// created a new instance
		// created the object of the class
		Day16_Constrautor cons = new Day16_Constrautor();
		Day16_Constrautor para_cons = new Day16_Constrautor("administrator");
		Day16_Constrautor para_cons2 = new Day16_Constrautor("editor");
		Day16_Constrautor twopara_cons = new Day16_Constrautor("admin", "qa.codegstor.us");
		
		Day16_Constrautor int_cons = new Day16_Constrautor(1000);
		
		
        // calling the method
		cons.hello();
		para_cons.hello();
		
		
		// class reference when the method is declared static
		// Day16_construcktor.hello(;
	}

}
