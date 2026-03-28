package OCP_2.OCPResolved;

public interface Employee {
	
	double calculateBonus(double salary);
	
	// this interface method will be implemented by different employee types (e.g., Manager, Developer, Intern) to calculate their respective bonuses without modifying existing code, thus adhering to the Open-Closed Principle.
	// different employee types will provide their own implementation of the calculateBonus method, allowing us to add new employee types without changing the existing code of the Employee interface or other employee classes.

}
