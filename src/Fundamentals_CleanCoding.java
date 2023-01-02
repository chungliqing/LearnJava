import java.util.Scanner;
import java.text.NumberFormat;

public class Fundamentals_CleanCoding{
	public static void main(String[] args) {
		/* greet
		String message = greetUser("Mosh", "Hamedani");
		System.out.println(message);*/

		double principalAmount = readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
		double annualInterest = readNumber("Annual Interest Rate: ", 1, 30);
		byte durationInYear = (byte) readNumber("Period (Years): ", 1, 30);
		
        double mortgage = calculateMortgage(principalAmount, annualInterest, durationInYear);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
	}

	public static double readNumber(String prompt, double min, double max) {
		Scanner keyboardInput = new Scanner(System.in);
		double value = 0;

		while (true){
			System.out.print(prompt);
        	value = keyboardInput.nextDouble();
			if (value >= min && value <= max){
				return value;
			}
			else
				System.out.println("Enter a number between " + min + " and " + max + ".");
		}
	}

	public static double calculateMortgage(
		double principal, 
		double annualInterest, 
		byte years) {
		
		final byte monthsInAYear = 12;
        final byte getDecimalPercentage = 100;
		
		double monthlyInterest = (annualInterest/getDecimalPercentage) / monthsInAYear;
		short paymentsToMake = (short) (years * monthsInAYear);
		
		double mortgageAmt = principal * 
			(monthlyInterest * (Math.pow(1 + monthlyInterest, paymentsToMake)))
			/
			(Math.pow(1+monthlyInterest,paymentsToMake)-1);
		
		return mortgageAmt;
	}

	public static String greetUser(String firstName, String lastName){
		return "Hello " + firstName + " " + lastName;
	}
}
