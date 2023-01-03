import java.util.Scanner;
import java.text.NumberFormat;

public class Fundamentals_CleanCoding{
	final static byte monthsInAYear = 12;
    final static byte getDecimalPercentage = 100;
	public static void main(String[] args) {
		/* greet
		String message = greetUser("Mosh", "Hamedani");
		System.out.println(message);*/

		double principalAmount = readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
		double annualInterest = readNumber("Annual Interest Rate: ", 1, 30);
		byte durationInYear = (byte) readNumber("Period (Years): ", 1, 30);
		
        
		printMortgage(principalAmount, annualInterest, durationInYear);
		printPaymentSchedule(durationInYear, principalAmount, annualInterest);
	}

	public static double readNumber(String prompt, double min, double max) {
		double value = 0;
		Scanner keyboardInput = new Scanner(System.in);

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

	public static void printMortgage(double principalAmount, double annualInterest, byte durationInYear) {
		double mortgage = calculateMortgage(principalAmount, annualInterest, durationInYear);
		System.out.println("\nMORTGAGE");
		System.out.println("---------");
		System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
	}

	public static void printPaymentSchedule(byte years, double principal, double annualInterest) {
		System.out.println("\nPAYMENT SCHEDULE");
		System.out.println("-----------------");
		for (short month = 0; month <= years * monthsInAYear; month++){
			double balance = calculateBalance(principal, annualInterest, years, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

	public static double calculateBalance(double principal, 
										double annualInterest,
										byte years,
										short numberOfPaymentsMade){

		double monthlyInterest = (annualInterest/monthsInAYear)/getDecimalPercentage;
		short numberOfPayments = (short) (years * monthsInAYear);

		double balanceAmt = principal *
							(
								(Math.pow(1+monthlyInterest, numberOfPayments)) -
								 Math.pow(1+monthlyInterest, numberOfPaymentsMade)
							)
							/	(Math.pow(1+monthlyInterest, numberOfPayments) - 1);

		return balanceAmt;
	}

	public static double calculateMortgage(
		double principal, 
		double annualInterest, 
		byte years) {
		
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
