package DIP_5.DIPResolved;

// We resolve the DIP violation by making the Order class depend on an abstraction (interface) rather than a concrete implementation. However, in this example, we will keep it simple and directly use the creditCardPayment class for demonstration purposes. 

public class Order {
	private Payment paymentProcessor;

	public Order(Payment paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	public void placeOrder(double amount) {
		// Logic to place the order
		System.out.println("Placing order for $" + amount);
		paymentProcessor.processPayment(amount);
	}

}
