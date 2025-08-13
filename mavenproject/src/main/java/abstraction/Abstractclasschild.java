package abstraction;

public class Abstractclasschild extends Abstractclassparent {
public void meth() {
	System.out.println("Abstract method overriding");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstractclassparent c=new Abstractclasschild();
c.meth();
c.display();
	}

}
