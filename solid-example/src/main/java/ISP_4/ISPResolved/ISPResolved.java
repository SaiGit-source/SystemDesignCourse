package ISP_4.ISPResolved;

public class ISPResolved {

	public static void main(String[] args) {
		Employee manager = new Manager();
		System.out.println("Manager Salary: " + manager.calculateSalary());
		System.out.println("Manager Stocks: " + ((Stock) manager).allocateStocks());

		Employee intern = new Intern();
		System.out.println("Intern Salary: " + intern.calculateSalary());
	}
	// Intern class is not forced to implement the allocateStocks method, adhering to the ISP.

}

/* Output:
Manager Salary: 5000.0
Manager Stocks: 100
Intern Salary: 1500.0
*/