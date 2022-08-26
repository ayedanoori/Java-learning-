package java_data_types;

abstract class Marks { 
	abstract int getPercentage();
	
	 class StudentA extends Marks {
		int biology;
		int math;
		int physics;
		int chemistry;
		
		StudentA(int biology, int math, int physics) {
			this.biology = biology;
			this.math = math;
			this.physics = physics;
			this.chemistry = chemistry;
		}

		int getPercentage() {
			int percentage = ((biology + math + physics + chemistry) / 4 );
			return percentage;
	}
	
	 class StudentB extends Marks {
		 int biology;
		 int math;
		 int physics;
		 int chemistry;
		 
		 StudentB(int biology, int math, int physics, int chemistry) {
			 this.biology = biology;
			 this.math = math;
			 this.physics = physics;
			 this.chemistry = chemistry;
			 
		}

	
		int getPercentage() {
			int percentage = biology + math + physics + chemistry / 100;
			return percentage;
		}
	 
  public class Day22_Task3 {

	public static void main(String[] args) {
		
		StudentA a = new StudentA(80, 90, 90);
		System.out.println(a.getPercentage() + "%");
		
		StudentB b = new StudentB(75, 80, 75, 0);
		System.out.println(b.getPercentage() + "%");
		

	}
}
	 }
