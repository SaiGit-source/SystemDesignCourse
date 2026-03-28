package SRP_1;


/* Single Responsibility Principle (SRP) - Single Responsibility Principle states that a class or function 
 should have only one reason to change, meaning it should have only one responsibility or job. 
 This principle helps to make code more maintainable and easier to understand by ensuring that each class has a clear 
 and focused purpose.

 first responsibility: calculating bonus for employees based on their type and salary. 
 say a new type called "Contractor" is added, then we need to modify the calculateBonus method to accommodate the new type, which violates the Single Responsibility Principle.
 second responsibility: if we want to change the logic for calculating bonuses, 
 we would need to modify the calculateBonus method, which again violates the Single Responsibility Principle because it has more than one reason to change.
 */

public class SRPViolation {
	
	public double calculateBonus(String type, double salary) {
		if (type.equals("Manager")) {
			return salary * 0.2; // Logic for calculating bonus for managers
		} else if (type.equals("Developer")) {
			return salary * 0.1; // Logic for calculating bonus for developers
		} else if (type.equals("Intern")) {
			return salary * 0.05; // Logic for calculating bonus for interns 
		}
		else {
			return 0;
		}
		// you can add new employee types here, but it will require modifying this method, which violates the Single Responsibility Principle
	}	
	// lets refactor the calculateBonus method to adhere to the Single Responsibility Principle by creating separate classes for each employee type and their respective bonus calculation logic.

	/*
	public static void main(String[] args) {
		
		SRPViolation srpViolation = new SRPViolation();
		System.out.println(srpViolation.calculateBonus("Manager", 50000));
	}
	*/
}
