package polymorphism;

public class Compiletimepoly {
	public void display() {
		System.out.println("Polymorphism");
	}
	public int display(int a) {
		return a;
		
	}
	public void display(int n, char c)
	{
		System.out.println(n);
		System.out.println(c);
	}
	public void display(char f, int b, String s)
	{
		System.out.println(f);
		System.out.println(b);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletimepoly p=new Compiletimepoly();
		p.display();
		System.out.println(p.display(5));
		p.display(10,'C');
		p.display('D',20,"Display");

	}

}
