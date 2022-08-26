package java_data_types;

public class Day25_MoreStrings {

	public static void main(String[] args) {
		
		
		String words = "a2A@m5$bW3S#";
		String noNumber = words.replaceAll("[0-9]", "");
		
		System.out.println("Before removing [0-9] numbers : "+words);
		System.out.println("After removing [0-9] numbers : "+noNumber);
		
		String noUpperCase = words.replaceAll("[A-Z]", "");
		System.out.println("After removing [A-Z] characters : "+noUpperCase);
		
		String nolowerCase = words.replaceAll("[a-z]", "");
		System.out.println("After removing [a-z] characters : "+nolowerCase);
		
		String onlyspecialcharacters = words.replaceAll("[A-Za-Z0-9]", "");
		System.out.println("This will show special characters only : "+onlyspecialcharacters );
		
		String showNumbersOnly = words.replaceAll("[^0-9]", "");
		System.out.println(showNumbersOnly);
		
		String showUpperCaseOnly = words.replaceAll("[^A-Z]", "");
		System.out.println(showUpperCaseOnly);
		
		String showLowerCaseOnly = words.replaceAll("[^a-z]", "");
		System.out.println(showLowerCaseOnly);
	}

}