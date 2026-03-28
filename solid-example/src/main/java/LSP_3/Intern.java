package LSP_3;

public class Intern implements Employee {

	public double calculateSalary() {
		// Interns are paid a fixed stipend, so we return a constant value
		return 1500.00; // Example stipend amount
	}
	
	// this method violates the Liskov Substitution Principle because it is not applicable to interns, who do not receive stock options.
	// we have this method in the interface Employee, but it does not make sense for the Intern class to implement it, as interns do not receive stock options.
	public void allocateStocks() {
		// Interns do not receive stock options, so this method does nothing
		throw new UnsupportedOperationException("Interns do not receive stock options.");
	}
	// the problem is that, if some parts in the program expect an Employee to have the allocateStocks() method, and if we pass an Intern object to that part of the program, it will throw an exception, which violates the Liskov Substitution Principle.
}


// multiple ways to fix this violation:
// 1. to modify the Intern class to implement the allocateStocks() method in a way that does not throw an exception, but instead returns a default value 0 or does nothing. However, this may not be ideal as it can lead to confusion and may not accurately represent the behavior of an intern.
// 2. 
