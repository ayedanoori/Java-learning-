package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
		name();
		
		
		// argument
		name2("John");
		name2("Ali");
		name2("Ken");
		
		name3("John", 25);
		name3("Milke", 38);
		name3("Steve", 28);
		
		String a = day(); // in return it is going to give me string value 
		System.out.println(a);
								
		String b = month(); // August
		System.out.println(b);
		
		String value = topic(" void and non void methods");
		System.out.println(value);
		
		System.out.println(topic("parameteried and non parameteried"));;
		}
	
	//non void method with parameter
	public static String topic(String a) {
		return"Today we are learning"+a;
	}
	
	public static String day() {
	     String todaysDay = "Tuesday";
	     return todaysDay;
	}
	
	public static String month() {
	     return "August";
	} 
	
	// method without parameter
	public static void name( ) {
		System.out.println("My name is Khan");
	}
	// method without parameter
		public static void name2( String a) {
			System.out.println("My name is" +a);
		
	}
		// method without parameter
		public static void name3(String name, int age ) {
			System.out.println(name +"15 "+ "age years old.");
			
}
}