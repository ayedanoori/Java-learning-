package java_data_types;

public class Day10_2DArrys {

	public static void main(String[] args) {
		
		
		String[][] countries = new String[2][2];
		countries[0][0] = "USA";
		countries[0][1] = "Canada";
		countries[1][0] = "Switzerland";
		countries[1][1] = "france";
		
		System.out.println(countries[1][1]);
		System.out.println(countries[1][1]);
		
		
		int[][] rollNumber = new int[2][2];
		     rollNumber[0][0] = 20;
		     rollNumber[0][1] = 30;
		     rollNumber[1][1] = 40;
		     rollNumber[1][0] = 30;
		     
		     System.out.println(rollNumber[1][1]);
		     
				

		 // string[] counries1 = { "Canada" , "USA", "Switzerland", "France" };
		     String[][] _countries = {
		    		 { "USA", "Canada" },
		    		 { "France", "Switzerland" },
		    		 { "Germany", "England" }
		     };
		  System.out.println(_countries[1][1]);
		  
		  
	//	  System.out.println(_countries[1][1]);
	//	  System.out.println(_countries[2][1]);
	//	  System.out.println(_countries.length);
	//	  System.out.println(_countries[0].length);
	//	  System.out.println(_countries[1].length);
	//	  System.out.println(_countries[2].length);
		  
		  
		  for(int rows=0; rows < _countries.length; rows++) {
			  for(int column=0; column < _countries[rows].length; column++) {
				  System.out.println(_countries[rows][column]);
				  
				  
				  
			  }
		  }
		  
		  
	}

}