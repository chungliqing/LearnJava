import java.util.Scanner;
import java.net.CacheRequest;
import java.text.NumberFormat;

public class Fundamentals_CleanCoding{
	public static void main(String[] args) {
		/* greet
		String message = greetUser("Mosh", "Hamedani");
		System.out.println(message);*/

		Scanner keyboardInput = new Scanner(System.in);

		double principalAmount = 0;
		double annualInterest = 0;
		byte durationInYear = 0;

        while (true){
			System.out.print("Principal ($1K - $1M): ");
        	principalAmount = keyboardInput.nextDouble();
			if (principalAmount >= 1_000 && principalAmount <= 1_000_000)
				break;
			else
				System.out.println("Enter a number between 1,000 and 1,000,000.");
		}

        while (true){
			System.out.print("Annual Interest Rate: ");
        	annualInterest = keyboardInput.nextDouble();
			if (annualInterest > 0 && annualInterest <= 30)
				break;
        	System.out.println("Enter a value greater than 0 and less than or equal to 30.");
		}

        while (true){
			System.out.print("Period (Years): ");
			durationInYear = keyboardInput.nextByte();
			if (durationInYear > 0 && durationInYear <= 30)
				break;
			System.out.println("Enter a value between 1 and 30.");
		}
		
        double mortgage = calculateMortgage(principalAmount, annualInterest, durationInYear);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
        keyboardInput.close();
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
