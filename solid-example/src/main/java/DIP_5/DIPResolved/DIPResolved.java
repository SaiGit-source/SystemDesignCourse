package DIP_5.DIPResolved;

// DIP Resolved: The Order class now depends on the Payment interface, which is an abstraction. This allows us to easily switch out different payment methods without modifying the Order class, adhering to the Dependency Inversion Principle.

public class DIPResolved {
	
	public static void main(String[] args) {
		// Create a payment processor (credit card payment)
		Payment creditCardPayment = new creditCardPayment();
		
		// Create an order and inject the payment processor
		Order order = new Order(creditCardPayment);
		
		// Place the order
		order.placeOrder(100.0);
		
		Order order2 = new Order(new googlePayment());
		order2.placeOrder(200.0);
	}

}


/* Output:
Placing order for $100.0
Processing credit card payment of $100.0
Placing order for $200.0
Processing Google Pay payment of $200.0
*/

