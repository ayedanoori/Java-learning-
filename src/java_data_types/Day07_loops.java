package java_data_types;

public class Day07_loops {

	public static void main(String[] args) {
	
		System.out.println("Before the loop");
		for (int i = 1; i >= 10; i++) {
			System.out.println("Hello world");
			}
        
		for (int i = 10; i >= 0; i-- ) {
			System.out.println(i);
		}
		//Task1 
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		//Task2
		
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		//Task3
		
		for (int i = 20; i <= 50; i++) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}   
	}
}