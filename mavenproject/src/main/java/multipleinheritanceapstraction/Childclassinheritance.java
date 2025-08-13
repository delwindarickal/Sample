package multipleinheritanceapstraction;

public class Childclassinheritance implements Parentinterface,Parentsubinterface {
public void meth() {
	System.out.println("Parent interface 1");
}

public void display() {
	System.out.println("Parent Interface 2");
}

public void childmeth() {
	System.out.println("Child class method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Childclassinheritance c=new Childclassinheritance();
    c.meth();
    c.display();
    c.childmeth();
    
	}

}
