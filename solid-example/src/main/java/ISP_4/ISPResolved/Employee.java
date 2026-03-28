package ISP_4.ISPResolved;

// similar to Stock interface, we can add Bonus interface for employees who are eligible for bonuses, and only those employees would implement it. This way, we adhere to the Interface Segregation Principle by ensuring that classes only implement interfaces that are relevant to them.
// that resolves ISP

public interface Employee {
	
	double calculateSalary();
}
