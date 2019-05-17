import java.util.Scanner;

public class SmoothieMaker {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flavor = smoothieFlavor();
		String size = smoothieSize();
		System.out.println("A " + size + " " + flavor + " smoothie is a whole lotta " + flavor + " smoothie");
	}// end main

	
	public static String smoothieFlavor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What flavor do you want?");
		String flavor = scanner.nextLine();
		return flavor;
	}
	
	public static String smoothieSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What size do you want?");
		String size = scanner.nextLine();
		return size;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
