package drj_01;

public class Call_Static_in_static {
	
	static void add() {
		System.out.println("Addition");
	}
	
	static void sub() {
		
		//add();
		
		System.out.println("Substraction");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		add();
		/*add();
		add();*/
		
		sub();
		//sub();
		//sub();
		
	}

}
