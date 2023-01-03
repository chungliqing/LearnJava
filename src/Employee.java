public class Employee {
	private int baseSalary;
	private int hourlyRate;

	public Employee(int baseSalary){ //constructor
		this(baseSalary, 0); //calling the contructor overload method with this()
		setHourlyRate(0);
	}

	public Employee(int baseSalary, int hourlyRate){ //constructor overload
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
	}

	private int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		if (hourlyRate < 0)
			throw new IllegalArgumentException("Hourly cannot be 0 or negative.");
		this.hourlyRate = hourlyRate;
	}

	public int calculateWage(int extraHours){ //no parameters coz the para are on top
		return baseSalary + (hourlyRate * extraHours);
	}

	public int calculateWage(){ //overloading method for calculate wage, if the value is 0/no extra hours
		return baseSalary; 
		//or return calculateWage(0);
	}

	private void setBaseSalary(int baseSalary){ //setters
		if (baseSalary <= 0)
			throw new IllegalArgumentException("Salary cannot be 0 or less."); //create new instance of this class; terminated and show error message.
		this.baseSalary = baseSalary;
	}

	private int getBaseSalary(){ //getters //create fields as private and use setters/getters
		return baseSalary;
	}
	
}
