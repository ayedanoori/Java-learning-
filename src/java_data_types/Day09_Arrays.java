package java_data_types;

public class Day09_Arrays {

      public static void main(String[] args) {
		
		
		
	int a; // declare the variable
	a=50; // initiailize the variable 
		
		
//   int[] rollNumber; // declare an array variable
//   rollNumber = new int[5];
		
	int[] _rollNumber = new int[5];
        _rollNumber[0] = 500;
		_rollNumber[1] = 300;
		_rollNumber[2] = 100;
		_rollNumber[3] = 400;
		_rollNumber[4] = 200;
		
		System.out.println(_rollNumber.length);
		
		int[] rollNum = {100,200,300,400,500};
		System.out.println(rollNum[3]);
		
		System.out.println(rollNum.length);
  
      
      String[] _rollName = new String[5];
        _rollName[0] = "Ayeda";
		_rollName[1] = "Safi";
		_rollName[2] = "Jaheer";
		_rollName[3] = "Junaid";
		_rollName[4] = "Eiraj";
		
		System.out.println(rollNum[3]);
     
		
		int[] rollNumber = { 100,200,300,400,500,100,200,300,400,500,100,200,300,400,500,100,200,300,400,500,100,200,300,400,500,100,200,300,400,500 };
		 System.out.println(rollNum[3]);
		 
		 int len = rollNum.length; // 30
		 
		 for (int i = 0; i < len; i++){
			 System.out.println(rollNum[i]);
		 }
 }


}