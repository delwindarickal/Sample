package sample;

public class Addavg {
	int a,b;
	int sum=0;
	public void add(int a, int b) {
		this.a=a;
		this.b=b;
		sum=a+b;
		
	}
	public  void calc() {
		float avg=sum/2;
		System.out.println("The Sum and average of "+a+ " and "+b+" are: "+sum+", "+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addavg c=new Addavg();
c.add(4, 2);;
c.calc();
	}

}
