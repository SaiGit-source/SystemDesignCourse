package DIP_5;

// Order class depends on the creditCardPayment class to process payments. This violates the Dependency Inversion Principle because the Order class is directly
// Dependency Inversion Principle states that high-level modules (core logic) should not depend on low-level modules. Both should depend on abstractions. 
// In this case, the Order class is a high-level module that depends on the low-level module of credit card payment processing. To adhere to the Dependency Inversion Principle, we can introduce an abstraction (e.g., PaymentProcessor interface) that both the Order class and the credit card payment class depend on. This way, the Order class can work with any payment processor that implements the PaymentProcessor interface, making it more flexible and decoupled from specific implementations.

public class Order {
	private creditCardPayment paymentProcessor;

	public Order() {
		this.paymentProcessor = new creditCardPayment();
	}

	public void placeOrder(double amount) {
		// Logic to place the order
		System.out.println("Placing order for $" + amount);
		paymentProcessor.processPayment(amount);
	}

}
