package java_data_types;

public class Day03_Ifcondition {

	public static void main(String[] args) {
	
		// true statement
     
		 if(2 == 2) {
		   System.out.println("the value is 2");
		 }
		System.out.println("after the if statements");
		
		// false statement
		if(2==3) {
			System.out.println("the value is not 2");
		}
		
		
		
		int a = 31;
		if(a==30) {
			System.out.println("the value is a 30");
		} else {
			System.out.println("the value is not 30");
			{
				
				
	System.out.println("***** compare 2 double value *****");
	
		double aa = 20.3567895;
		double bb = 40.647467587;
		if(aa==bb) {
			System.out.println("Both double values are same");
	} else {
		System.out.println("Both double values are not the same");
	}
		
		int b = 0;
		if(b > 0) {
			System.out.println("The value is positive");
		} else {
			System.out.println("The value is negative");
		}
  
		char value = 'e';
		if(value == 'b') {
			System.out.println("The value is a");
		} else if(value == 'b') {
			System.out.println("The value is b");
		} else if(value == 'c') {
			System.out.println("The value is c");
		} else if(value == 'd') {
			System.out.println("The value is d");
		} else {
			System.out.println("The value is something else"); 
		}
		
		String day = "monday";
		
		if(day== "monday") {
			System.out.println("The day is monday");
		} else if(day == "tuesday") {
		    System.out.println("The day is monday");
		} else if(day == "wensday") {
			System.out.println("The day is monday");
		} else if(day == "thursday") {
			System.out.println("The day is monday");
		} else if(day == "friday") {
			System.out.println("The day is monday");
		} else if(day == "saturday") {
			System.out.println("The day is monday");
		} else if(day == "sunday") {
			System.out.println("The day is sunday");
		} else {
			System.out.println("You have entered an invalid day of the week");
		}
		
	
		
		boolean isRaing = true;
		
		if(isRaing == true) {
			System.out.println("It is raining");
		} else {
			System.out.println("It is not raining");
		}
	}
	