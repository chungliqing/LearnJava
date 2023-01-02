import java.util.Scanner;

public class Fundamentals_ControlFlow{
	public static void main(String[] args) {
		forEachLoop();
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

	public static void exerciseFizzBuzz() {
		//5 = fizz; 3 = buzz; 5 & 3 = Fizz Buzz; !5 || !3 prints the number;
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

	public static void forLoops() {
		//for (counter; boolean condition with counter; incremental/decremental)

		for (int i = 0; i < 5; i++){
			System.out.println("Hello World" + i);
		} System.out.println();
		

		for (int i = 1; i <= 5; i++){
			System.out.println("Hello World" + i);
		} System.out.println();
		
		for (int i = 5; i > 0; i--){
			System.out.println("Hello World" + i);
		} System.out.println();
	}

	public static void whileLoops() {
		Scanner scanner = new Scanner(System.in);
		String input = ""; //initialize empty string

		//better for comparisons operators to be used on primitive types only and not reference str due to implicit casting; use .equals

		while (!input.equals("quit")){
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
		}

		scanner.close();
	}
	
	public static void doWhileLoops() {
		Scanner scanner = new Scanner(System.in);
		String input = ""; //initialize empty string

		do {
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
		} while (!input.equals("equit"));

		scanner.close();
		
		//use do while only when necessary
	}

	public static void breakAndContinue() {
		Scanner scanner = new Scanner(System.in);
		String input = "";

		while (true){
			System.out.println("Input: ");
			input = scanner.next().toLowerCase();
			if (input.equals("pass"))
				continue;

			if (input.equals("quit")){
				break;
			}
			System.out.println(input);
		}

		scanner.close();
	}

	public static void forEachLoop() {
		String[] fruits = {"Apple", "Mango", "Orange"};

		//to iterate from the front
		for (int i = 0; i < fruits.length; i++){
			System.out.println(fruits[i]);
		} System.out.println();

		//to iterate from the back
		for (int i = fruits.length; i > 0; i--){
			System.out.println(fruits[i-1]);
		} System.out.println();

		for (String fruit : fruits){
			System.out.println(fruit);
			//can only iterate from the beginning
			//no access to inde
		}
	}
}