package superkeyword;

public class Superchild extends Superparent{
int a=40;

public void display() {
	System.out.println(super.a);
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Superchild s=new Superchild();
   s.display();
	}

}
