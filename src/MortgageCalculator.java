public class MortgageCalculator {
	private final static byte getDecimalPercentage = 100;
	private final static byte monthsInAYear = 12;
	
	private double principal;
	private double annualInterest;
	private byte years;
	
	
	public MortgageCalculator(double principal, double annualInterest, byte years) {
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}

	public double calculateBalance(short numberOfPaymentsMade){
	
		double monthlyInterest = getMonthlyInterest();
		short numberOfPayments = getNumberOfPayments();
	
		double balanceAmt = principal *
							(
								(Math.pow(1+monthlyInterest, numberOfPayments)) -
								 Math.pow(1+monthlyInterest, numberOfPaymentsMade)
							)
							/	(Math.pow(1+monthlyInterest, numberOfPayments) - 1);
	
		return balanceAmt;
	}
	
	public double calculateMortgage() {
		
		double monthlyInterest = getMonthlyInterest();
		short paymentsToMake = getNumberOfPayments();
		
		double mortgageAmt = principal * 
		(monthlyInterest * (Math.pow(1 + monthlyInterest, paymentsToMake)))
		/
		(Math.pow(1+monthlyInterest,paymentsToMake)-1);
		
		return mortgageAmt;
	}
	
	public double[] getRemainingBalances(){
		var balances = new double[getNumberOfPayments()];
		for (short month = 1; month <= balances.length; month++)
			balances[month -1] = calculateBalance(month);
			
		return balances;
	}

	private short getNumberOfPayments() {
		return (short) (years * MortgageCalculator.monthsInAYear);
	}
	
	private double getMonthlyInterest() {
		return (annualInterest/MortgageCalculator.monthsInAYear)/getDecimalPercentage;
	}
}
