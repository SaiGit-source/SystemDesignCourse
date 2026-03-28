package DIP_5.DIPResolved;

public class creditCardPayment implements Payment {
		public void processPayment(double amount) {
		// Logic to process credit card payment
		System.out.println("Processing credit card payment of $" + amount);
	}

}
