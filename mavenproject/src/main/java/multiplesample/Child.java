package multiplesample;

public class Child implements Parent, Parentsub {
	public void display() {
		System.out.println("Parent interface");
	}
	public void meth() {
		System.out.println("Parent sub interface ");
	}
	public void child() {
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c=new Child();
c.display();
c.meth();
c.child();
	}

}
