
public class Fundamentals_ControlFlow{
	public static void main(String[] args) {
		logicalOperators();
    }

	public static void comparisonOperators() {
		int x = 1;
		int y = 1;
		System.out.println(x == y); //prints true = equal
		System.out.println(x != y); //prints false = not equal
		System.out.println(x <= y); //prints true 
		// >, >=, <, <=, 
	}

	public static void logicalOperators() {
		int temperature = 22;
		boolean isWarm = temperature > 20 && temperature < 30; //looks from left to right
		System.out.println(isWarm); //prints true

		boolean hasHighIncome = false;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		System.out.println(isEligible);		
	}
}