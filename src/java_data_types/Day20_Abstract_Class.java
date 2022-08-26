package java_data_types;

abstract class Furniture {
	abstract void color(); // abstract method 
	abstract void material();
	abstract void weight ();	
}

abstract class chair extends Furniture {
	void color() {
		System.out.println("This is a color method");
		
	}
	void material() {
		System.out.println("This is a material method");
	}
	abstract void dimention();
	
}
 class brand extends chair {
	 void dimention() {
		 System.out.println("This is a dimention method");
	 }
	void weight() {
		System.out.println("This is a weight method");
	}
}
public class Day20_Abstract_Class {

	public static void main(String[] args) {
		brand b = new brand();
		b.color();
		b.material();
		b.dimention();
		
		

	}

}
