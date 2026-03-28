package OCP_2.OCPResolved;

public class RegularEmployee implements Employee {
	
	@Override
	public double calculateBonus(double salary) {
		return 2000; // Logic for calculating bonus for regular employees
	}

}
