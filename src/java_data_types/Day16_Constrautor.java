package java_data_types;

public class Day16_Constrautor {

String myname;
		
		Day16_Constrautor() {
			System.out.println("login as admin");
			
		}
		
		Day16_Constrautor(String name) {
			myname = name;
			System.out.println("logged in as : "+name);
			
			}
		Day16_Constrautor(String name, String env) {
			System.out.println("logged in as : "+name);
			System.out.println("logged in to : "+env);
	}
		Day16_Constrautor(int value) {
		System.out.println("The value is : "+value);
}

		void hello() {
			System.out.println("This is hello method");
		}
		
	}