package ISP_4.ISPResolved;

public class Manager implements Employee, Stock {

	public double calculateSalary() {
		// Managers have a base salary plus potential bonuses, so we return a calculated value
		return 5000.00; // Example base salary
	}

	public int allocateStocks() {
		// Managers are eligible for stock options, so we return a positive number of stocks allocated
		return 100; // Example number of stocks allocated
	}

}
