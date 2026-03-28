package DIP_5;

// It violates DIP because the Employee class directly depends on the AWSDatabase class. This creates a tight coupling between the Employee class and the specific implementation of the database, making it difficult to change or replace the database without modifying the Employee class. To adhere to the Dependency Inversion Principle, we can introduce an abstraction (e.g., Database interface) that both the Employee class and the AWSDatabase class depend on. This way, the Employee class can work with any database implementation that implements the Database interface, making it more flexible and decoupled from specific implementations.
// if you create another database class say AzureDatabase, you would have to modify the Employee class to accommodate the new database, which violates the Open/Closed Principle as well. 
// By introducing an abstraction, you can easily switch between different database implementations without modifying the Employee class, adhering to both the Dependency Inversion Principle and the Open/Closed Principle.
public class Employee {
	
	private AWSDatabase database;
	
	public Employee() {
		this.database = new AWSDatabase();
	}
	
	public void saveEmployeeData() {
		database.connect();
		System.out.println("Employee data saved to AWS Database");
	}

}
