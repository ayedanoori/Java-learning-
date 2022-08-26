package java_data_types;

public class Day10_ArrySum {

	public static void main(String[] args) {
		

		int[] number = { 2,3,4,5,6,7 };
		int sum = 0;
		for(int a=0; a< number.length; a++) {
			sum = sum + number[a];
		}
		System.out.println("The sum is :"+sum);
		
		
	int[] salaries = { 200, 300, 500, 700, 900 };
	
	
	for (int A = 0; A < salaries.length; A++) {
		sum = sum + salaries[A];
	}
	System.out.println("the sum is :" + sum);
}
}