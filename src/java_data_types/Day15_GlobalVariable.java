package java_data_types;

public class Day15_GlobalVariable {
		// Global variable 
		String phone = "Iphone";
		String color = "black";
		static int memory = 32;
		
		public static void main(String[] args) {
			Day15_GlobalVariable johnphone = new Day15_GlobalVariable();
			System.out.println(johnphone.phone);
			System.out.println(johnphone.color);
			System.out.println(johnphone.memory); // 32
			
			Day15_GlobalVariable stevePhone = new Day15_GlobalVariable();
			stevePhone.phone = "Iphone13";
			stevePhone.color = "Red";
			stevePhone.phone = "Iphone14";
			System.out.println(stevePhone.phone);
			System.out.println(stevePhone.color);
			System.out.println(stevePhone.memory); // 64
			
			System.out.println("*****Mike Phone *****");
			Day15_GlobalVariable mikePhone = new Day15_GlobalVariable();
			System.out.println(mikePhone.phone); // default IPhone
			System.out.println(mikePhone.color); // default black
			System.out.println(mikePhone.memory); // default 32 ?
			
			Day15_GlobalVariable vinPhone = new Day15_GlobalVariable();
			vinPhone.possible();
			
		}
			
		public void possible() {
			Day15_GlobalVariable vinPhone = new Day15_GlobalVariable();
			vinPhone.phone = "Iphone 12";
			vinPhone.color = "Grey";
			System.out.println(vinPhone.phone); // IPhone
			System.out.println(vinPhone.color); // black
			System.out.println(vinPhone.memory); // 64
		

	}

}
