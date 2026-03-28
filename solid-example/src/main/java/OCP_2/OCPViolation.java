package OCP_2;

// Open-Closed Principle states that classes should be open for extension but closed for modification. This means that you should be able to add new functionality to a class without changing its existing code. 
// In this example, we have a class called "Shape" that has a method called "area". If we want to add a new shape, we would have to modify the existing code of the "Shape" class, which violates the Open-Closed Principle.

public class OCPViolation {
	private String type;
	
	public OCPViolation(String type) {
		this.type = type;
	}
	
	// this method violates the Open-Closed Principle because if we want to add a new employee type, we would have to modify the existing code of the calculateManagerBonus method, which is not ideal because it can lead to bugs and maintenance issues.
	// to add a new employee type, the calculation requires an additional if-else statement, which can make the code more complex and harder to maintain. This is a violation of the Open-Closed Principle because we are modifying existing code to add new functionality, rather than extending it.
	public double calculateManagerBonus(String type, double salary) {
		if (type.equals("Manager")) {
			return calculateManagerBonus(salary); // Logic for calculating bonus for managers
		}
		else if (type.equals("Developer")) {
			return calculateDeveloperBonus(salary); // Logic for calculating bonus for developers
		}
		else if (type.equals("Intern")) {
			return calculateInternBonus(salary); // Logic for calculating bonus for interns 
		}
		else {
			return 0;
		}
	}
	
	private double calculateManagerBonus(double salary) {
		return salary * 0.2; // Logic for calculating bonus for managers
	}
	
	private double calculateDeveloperBonus(double salary) {
		return salary * 0.1; // Logic for calculating bonus for developers
	}
	
	private double calculateInternBonus(double salary) {
		return salary * 0.05; // Logic for calculating bonus for interns 
	}

	public static void main(String[] args) {

	}

}
