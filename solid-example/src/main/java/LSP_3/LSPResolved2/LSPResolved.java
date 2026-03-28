package LSP_3.LSPResolved2;

public class LSPResolved {

	public static void main(String[] args) {
		Employee manager = new Manager();
		System.out.println("Manager Salary: " + manager.calculateSalary());
		System.out.println("Manager Stocks: " + ((Stock) manager).allocateStocks());

		Employee intern = new Intern();
		System.out.println("Intern Salary: " + intern.calculateSalary());
	}
	// In this resolved version, the Intern class does not implement the Stock interface, and therefore does not have to provide an implementation for the allocateStocks() method. This allows us to maintain the Liskov Substitution Principle, as we can substitute an Intern for an Employee without any issues, while still allowing Managers to have their own specific behavior related to stock allocation.

}
