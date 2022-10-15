package page;

public class GitTest2 {

	public static void main(String[] args) {
		printMe1();
		printMe2();
		printMe3();
		
	}

	public static void printMe1() {
		System.out.println("PrintMe");
	}
	
	public static void printMe2() {
		System.out.println("PrintMe2");
	}
	
	public static void printMe3() {
		System.out.println("PrintMe3");
		System.out.println("PrintMe1");
	}
}
