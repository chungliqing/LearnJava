public class Employee {
	public int baseSalary;
	public int hourlyRate;

	public int calculateWage(int extraHours){ //no parameters coz the para are on top
		return baseSalary + (hourlyRate * extraHours);
	}

	public void setBaseSalary(int baseSalary){
		if (baseSalary <= 0)
			throw new IllegalArgumentException("Salary cannot be 0 or less."); //create new instance of this class
		this.baseSalary = baseSalary;
	}

	
}
