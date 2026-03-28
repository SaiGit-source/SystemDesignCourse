package SRP_1;

// Single responsibility principle (SRP) - Single Responsibility Principle states that a class or function should have only one responsibility

public class SRPResolved {
	
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
	
	// to calculate bonus for Manager, we need to update only the calculateManagerBonus method, and if we want to change the logic for calculating bonuses for developers or interns, we would only need to modify the respective methods, which adheres to the Single Responsibility Principle because each method has only one reason to change.
	// now calculateBonus() method has only one reason to change, that is, only when new employee types are added, but the logic for calculating bonuses for existing employee types is separated into different methods, which adheres to the Single Responsibility Principle.
	
	public static void main(String[] args) {
		
		SRPResolved srpResolved = new SRPResolved();
		System.out.println(srpResolved.calculateManagerBonus("Manager", 50000));

	}

}
