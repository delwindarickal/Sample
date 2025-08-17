package runtimesample;

public class Child extends Parent {
	public void display() {
		super.display();
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Parent p=new Child();
     p.display();
	}

}
