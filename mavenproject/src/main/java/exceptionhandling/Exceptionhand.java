package exceptionhandling;

public class Exceptionhand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int res=6/0;
		System.out.println(res);

	}
		catch(ArithmeticException e) {
        System.out.println(e);
		}
		finally {
			System.out.println("Arithmetic Exception");
		}
}

}
