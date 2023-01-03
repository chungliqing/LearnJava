public class OOP_GettingStartedandClasses{
	public static void main(String[] args){
		
		gettersAndSetters();

	}

	public static void programmingParadigms() {
		/*
			* Programming Paradigms
				* Procedural
				* Functional		-	Data, Behavior	-	separate
				* Object-Oriented	-	Data (State), Methods (Behaviors) = Object
				* Event-Driven
				* Logic
				* Aspect-Oriented 
		 */
	}

	public static void objectOrientedProgramming() {
		/*
		 * Benefits of OOP
		 	* Reduced Complexity
			* Easier Maintenance
			* Code Reuse
			* Faster Development
		 */
	}

	public static void classesAndObjects(){
		/*
		 	* Class = a blueprint for creating objects
				Class Name = Car
				Attributes = started, currentSpped, currentGear //implement these attributes using fields (variables def in class)
				Methods/Behaviors = start(), stop(), brake()

				Lamp					TV
				isOn = boolean			currentVolume, currentChannel, isOn
				turnOn(), turnOff()		turnOn(), turnOff(), increaseVolume(), decreaseVolume()

				TextBox
				text, limit, length, isFocused, isDisabled
				setText(), clear(), enable(), focus()

			* Object = an instance of a class //car1, car2, crv, hrv; independent; separate memory and states
		 */
	}

	public static void creatingClasses() {
		/*	add each class to a separate file
			Naming Convention = PascalCasing = TextBox
			public = access modifier; whether other classes in the project can see/use this method
			see TextBox.java
		*/
	}

	public static void creatingObjects() {
		//TextBox textBox1 = new TextBox();
		var textBox1 = new TextBox();
		textBox1.setText("Box 1"); //use the dot op to look at the members of this class
		System.out.println(textBox1.text.toUpperCase()); //prints Box 1

		var textBox2 = new TextBox();
		textBox2.setText("Box 2"); // these instances operate independently with different states

		/* 
			* create a TextBox variable, by initializng with the new operator for the TextBox class
			* new TextBox() = instantiating the TextBox class = creating a new instance of this class
			* can replace Textbox on the left with var, and java will detect the variable type based on the assignment operator
			* different from JavaScript where var is used to declare a variable

			* if ref types are not initialized, they're set to null, which can lead to crashing

			* null pointer exists when something it's pointing to doesn't exist
		*/
	}

	public static void memoryAllocation(){
		/*
		 	* Java manages two areas of memory: HEAP - objects; STACK - primitives, short-lived variables, ref obj in heap
				1. HEAP
					* stores objects
				2. STACK
					* stores primitives, short-lived variables, and variables storing references to objects in the HEAP

				Example: var textBox1 = new TextBox();
					1. Evaluate the right side (assigment)
						* creating a new TextBox object and storing it in the HEAP (with address let's say 100)
					2. Java Runtime executes the left and alocates stack memory to store the HEAP address
						* variable is referencing an object in the HEAP, that's why its called a ref type; don't store the actual values

				var textBox1 = new TextBox();
				var textBox 2 = textBox1;

				both store/reference the same address on the heap
				* Deallocating Memory
					* exiting a method, Java runtime will auto remove variables stored in the mstack
					* Garbage Collection, memory allocated which are unused for a time are trashed; when a heap is not referenced already by a location in the stack
		 */
	}

	public static void proceduralProgramming() {
		//based on procedure/function calls; this is procedural programming; calling methods only
		int baseSalary = 50_000;
		int extraHours = 10;
		int hourlyRate = 20;

		int wage = calculateWage(baseSalary, extraHours, hourlyRate);
		System.out.println(wage);

		//cons; methods with many parameters; hard to maintain
	}

	public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
		return baseSalary + (extraHours * hourlyRate);
	}

	public static void encapsulation() {
		/*
			* Encapsulation = First Principle of OOP
				* bundle the data and methods that operate on the data in a single unit/object/class;

		 */

		//encapsulated proceduralProgramming() to an Employee class and using the object in the main
		
		var employee = new Employee();
		//employee.baseSalary = 50_000;
		//employee.hourlyRate = 20;
		int wage = employee.calculateWage(10);	
		System.out.println(wage);
	}

	public static void gettersAndSetters() {
		var employee = new Employee();
		employee.setBaseSalary(-1);
		employee.setHourlyRate(20);
		int wage = employee.calculateWage(10);	
		System.out.println(wage);
	}

	public static void abstraction() {
		/*
			 * second principle of OOP
			 * reduce complexity by hiding unnecessary details - most misund in OOP
			 * remote control's button vs transistors
			 * hide implementation details of a class and treat it like a blackbox 
			 * private fields are like the transistors; don't need to work directly with it
		 */
	}

	public static void coupling() {
		/*
			 * Reduce Coupling - the level of dependency between classes 
				 * attached to the phone; can't live without 
				 * reduce the impact of changes 
			 * make unnecessary methods private; reduce coupling, cannot access
		*/
		
		var employee = new Employee();
		employee.setBaseSalary(-1);
		employee.setHourlyRate(20);
		int wage = employee.calculateWage(10);	
		System.out.println(wage);
	}

	public static void reduceCoupling() {
		var browser = new Browser();
		browser.navigate(null);
	}

	public static void constructor() {
		//use constructors to initialize our objects
		var employee = new Employee(50_000, 20);
		int wage = employee.calculateWage(10);	
		System.out.println(wage);	
	}
}