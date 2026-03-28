package ISP_4;

public class Intern implements Employee {

	public double calculateSalary() {
		// Interns are paid a fixed stipend, so we return a constant value
		return 1500.00; // Example stipend amount
	}
	
	// This violates the ISP because it forces the Intern class to implement a method that is not relevant to its role.
	public int allocateStocks() {
		return 0;
	}
}
