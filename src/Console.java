import java.util.Scanner;

public class Console {
	private static Scanner keyboardInput= new Scanner(System.in);

	public static double readNumber(String prompt) {
		return keyboardInput.nextDouble();
	}

	public static double readNumber(String prompt, double min, double max) {
		double value = 0;
	
		while (true){
			System.out.print(prompt);
	    	value = keyboardInput.nextDouble();
			if (value >= min && value <= max){
				return value;		
			}
			else{
				System.out.println("Enter a number between " + min + " and " + max + ".");
			}
		}
	}
}
