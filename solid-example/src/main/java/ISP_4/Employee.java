package ISP_4;

// ISP (Interface Segregation Principle) states that clients should not be forced to depend on interfaces they do not use. In this example, the Employee interface includes methods that may not be applicable to all types of employees, such as interns who do not receive stock options. This violates the ISP because it forces the Intern class to implement a method that is not relevant to its role. To adhere to the ISP, we could create separate interfaces for different types of employees, such as a SalariedEmployee interface and a StockOptionEligible interface, allowing each class to implement only the methods that are relevant to its specific role.
// Interface Segregation Principle (ISP) states that a class should not be forced to implement methods it doesn't use. In this example, the Employee interface includes methods that may not be applicable to all types of employees, such as interns who do not receive stock options. 
// This violates the ISP because it forces the Intern class to implement a method that is not relevant to its role. 
// To adhere to the ISP, we could create separate interfaces for different types of employees, such as a SalariedEmployee interface and a StockOptionEligible interface, allowing each class to implement only the methods that are relevant to its specific role.

public interface Employee {
	
	double calculateSalary();
	int allocateStocks();

}
