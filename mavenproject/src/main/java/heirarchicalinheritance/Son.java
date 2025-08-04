package heirarchicalinheritance;

public class Son extends Singleparent {
	public void childson() {
		System.out.println("Son Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		Childdaug d=new Childdaug();
		s.childson();
		s.parent();
		d.daughter();
		d.parent();
		
	}

}
