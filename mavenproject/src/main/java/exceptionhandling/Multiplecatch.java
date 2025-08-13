package exceptionhandling;

public class Multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a[]=new int[10];
		a[10]=10/0;
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("Array index out of bound!!");
		}
		catch(ArithmeticException o)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e) {// Exception - parent class of all exceptions
			System.out.println("Other");
		}
	}

}
