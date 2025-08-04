package multilevelinheritance;

public class Childclass extends Parentclass {
	public void child() {
		System.out.println("Multilevel inheritance- Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Childclass c=new Childclass();
 c.grand();
 c.parent();
 c.child();
 
 
	}

}
