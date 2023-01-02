import java.util.Scanner;
import java.text.NumberFormat;

public class Fundamentals_CleanCoding{
	public static void main(String[] args) {
		/* greet
		String message = greetUser("Mosh", "Hamedani");
		System.out.println(message);*/

		Scanner keyboardInput = new Scanner(System.in);
        final byte monthsInAYear = 12;
        final byte getDecimalPercentage = 100;
		double principalAmount = 0;
		double monthlyInterest = 0;
		int paymentsToMake = 0;

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
        	double annualInterest = keyboardInput.nextDouble();
			if (annualInterest > 0 && annualInterest <= 30){
				monthlyInterest = (annualInterest/getDecimalPercentage) / monthsInAYear;
				break;
			}
			else
        		System.out.println("Enter a value greater than 0 and less than or equal to 30.");
		}

        while (true){
			System.out.print("Period (Years): ");
			byte durationInYear = keyboardInput.nextByte();
			if (durationInYear > 0 && durationInYear <= 30){
				paymentsToMake = durationInYear*monthsInAYear;
				break;
			}
			else
        		System.out.println("Enter a value between 1 and 30.");
		}
		
        double mortgageAmt =    principalAmount * 
                                (monthlyInterest*(Math.pow(1+monthlyInterest, paymentsToMake)))
                                /
                                (Math.pow(1+monthlyInterest,paymentsToMake)-1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgageAmt));
        keyboardInput.close();
		
	}

	public static String greetUser(String firstName, String lastName){
		return "Hello " + firstName + " " + lastName;
	}
}
