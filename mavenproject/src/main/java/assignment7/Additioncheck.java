package assignment7;
//program 1 class 2
public class Additioncheck extends Addition {
	
	public void additioncheck() {
		super.addition(10, 15);
		System.out.println("The sum of "+a+", "+b+" is "+res);
		if(super.res%10==0) {
			System.out.println(res+" is divisible by 10");
		}
		else {
			System.out.println(res+" is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Additioncheck c=new Additioncheck();
c.additioncheck();
	}

}
