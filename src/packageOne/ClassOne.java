package packageOne;

import packageTwo.ClassThree;

public class ClassOne {
	public int a1 = 10;
	private int b1 = 20;
	
	
	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodOne();
		System.out.println(c1.a1);
		System.out.println(c1.b1);
		
		ClassFour c4 = new ClassFour();
	// System.out.println(c4.b4); variable is not accessible because it is private
		System.out.println(c4.a4);
		
		ClassThree c3 = new ClassThree();
		// c3.methodThree(); // because the method is private
		System.out.println(c3.a3);
		//System.out.println(c3.b3); // because the variable is private 
	}
 public static void methodOne() {
	 System.out.println("This is method 1.");
	   
 }
  private static void methodFour() {
	  System.out.println("This is method 4");
  }
}
