package superkeyword;

public class Childmeth extends Parentmeth {

	public void display() {
		System.out.println("Child class super");
	}
	public void methcall() {
		super.display();// Parent method
		display();// Child method
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childmeth c=new Childmeth();
c.methcall();
	}

}
