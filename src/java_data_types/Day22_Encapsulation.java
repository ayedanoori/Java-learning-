package java_data_types;

public class Day22_Encapsulation {

	public static void main(String[] args) {
		 
		Day22_Employee_Information a = new Day22_Employee_Information("Ayeda", 111, true);
	//	a.setName("Ayeda");
		System.out.println(a.getName());
		
	//	a.setSsn(11111111);
		System.out.println(a.getssn());
		
	//	a.setGraduated(true);
		System.out.println(a.getGraduated());
	}

}
