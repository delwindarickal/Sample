package exceptionhandling;

public class Exceptionthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=17;
		if(a>=18) {
			System.out.println("Eliglible for voting");
		}
		else {
			throw new ArithmeticException("Ineligible!!");
		}

	}

}
