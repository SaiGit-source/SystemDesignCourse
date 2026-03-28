package LSP_3.LSPResolved;

public class Intern implements Employee {

	public double calculateSalary() {
		// Interns are paid a fixed stipend, so we return a constant value
		return 1500.00; // Example stipend amount
	}
	
	// this method violates the Liskov Substitution Principle because it is not applicable to interns, who do not receive stock options.
	// we have this method in the interface Employee, but it does not make sense for the Intern class to implement it, as interns do not receive stock options.
	public int allocateStocks() {
		return 0;
	}
}


// multiple ways to fix this violation:
// 1. to modify the Intern class to implement the allocateStocks() method in a way that does not throw an exception, but instead returns a default value 0 or does nothing. However, this may not be ideal as it can lead to confusion and may not accurately represent the behavior of an intern.
// 2. to refactor the code, remove allocateStocks() method from the Employee interface and create a new interface, such as StockOptionEligible, that includes the allocateStocks() method. Then, only the classes that are eligible for stock options (e.g., FullTimeEmployee) would implement this new interface, while the Intern class would not be affected by it. This way, we can maintain the Liskov Substitution Principle and ensure that each class only implements methods that are relevant to its behavior.
