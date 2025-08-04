package polymorphism;

public class Childclass extends Parentclass {
public void parentmeth() {
	super.parentmeth();
	System.out.println("Child- Run Time polymorphism");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass c=new Childclass();
		c.parentmeth();
Parentclass p=new Childclass();//upcasting
p.parentmeth();
	}

}
