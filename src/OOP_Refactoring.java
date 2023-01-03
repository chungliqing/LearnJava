public class OOP_Refactoring{
	public static void main(String[] args) {
		double principalAmount = Console.readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
		double annualInterest = Console.readNumber("Annual Interest Rate: ", 1, 30);
		byte durationInYear = (byte) Console.readNumber("Period (Years): ", 1, 30);

		var calculator = new MortgageCalculator(principalAmount, annualInterest, durationInYear);
		
		var report = new MortgageReport(calculator);
		report.printMortgage();
		report.printPaymentSchedule();
	}
}
