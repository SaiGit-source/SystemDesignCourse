package DIP_5.DIPResolved;

public class googlePayment implements Payment {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing Google Pay payment of $" + amount);

	}

}
