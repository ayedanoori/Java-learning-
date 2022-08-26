package java_data_types;

public class Day15_Static_Method {

	public static void main(String[] args) {
		methodeOne();
		
		Day15_Static_Method aa new Day15_Static_Method();
		aa.methodeOne();
		aa.methodeOne();
		
		String bb = aa.methodeOne();
		System.out.println(bb);
		

	}
	public static void methodeOne() {
		System.out.println("This is method one");
		}
	public void methodeTwo() {
		System.out.println("this is method two");
	}
	public String methodTwoThree() {
		return "Hello";
		
	}
}
