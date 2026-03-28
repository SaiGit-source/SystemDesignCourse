package OCP_2.OCPResolved;

public class OCPResolved {

	public static void main(String[] args) {
		Employee manager = new Manager();
		Employee developer = new RegularEmployee();
		Employee intern = new Intern();
		
		double managerBonus = manager.calculateBonus(50000);
		double developerBonus = developer.calculateBonus(40000);
		double internBonus = intern.calculateBonus(30000);
		
		System.out.println("Manager Bonus: " + managerBonus);
		System.out.println("Developer Bonus: " + developerBonus);
		System.out.println("Intern Bonus: " + internBonus);

	}

}


/* Output
Manager Bonus: 5000.0
Developer Bonus: 2000.0
Intern Bonus: 100.0
*/