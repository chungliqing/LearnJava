import java.util.Scanner;

public class Fundamentals_ControlFlow{
	public static void main(String[] args) {
		exerciseFizzBuzz();
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

	public static void ifStatements() {
		int temperature = 21;
		if (temperature > 30) {
			System.out.println("It's a hot day");
			System.out.println("Drink water");
		} else if (temperature > 20) {
			System.out.println("Beautiful day");
		} else {
			System.out.println("Cold day");
		}
	}

	public static void simplifyingIfStatements(){
		int income = 120_000;
		/* Method 1: setting the conditions for checking high income status
		boolean hasHighIncome;

		if (income > 100_000)
			hasHighIncome = true;
		else
			hasHighIncome = false; */

		//Method 2
		boolean hasHighIncome = (income > 100_000);
	}

	public static void ternaryOperator() {
		int income = 120_000;
		String className = income > 100_000 ? "First" : "Economy";

		//ternary operator: (condition) ? "result" : "elseResult";
	}

	public static void switchStatements() {
		String role = "admin";

		switch (role){
			case "admin":
				System.out.println("You're an admin");
				break;
			case "moderator":
				System.out.println("You're a moderator");
				break;
			default:
				System.out.println("You're a guest");
		}
	}

	//5 = fizz; 3 = buzz; 5 & 3 = Fizz Buzz; !5 &3 prints the number;

	public static void exerciseFizzBuzz() {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Input number: ");
		int userInput = keyboardInput.nextInt();

		if (userInput % 5 == 0 && userInput % 3 == 0)
			System.out.println("FizzBuzz");
		else if (userInput % 3 == 0)
			System.out.println("Buzz");
		else if (userInput % 5 == 0)
			System.out.println("Fizz");
		else
			System.out.println(userInput);
	}
}