package aggregation;

public class AggregSec {
int b,c;
Aggreg p;//Aggregation - class object reference
AggregSec(int b, int c, Aggreg p){
	this.b=b;
	this.c=c;
	this.p=p;
}
public void display() {
	System.out.println(b);
	System.out.println(c);
	System.out.println(p.a);
	System.out.println(p.d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aggreg n=new Aggreg(33,44);// first class
		AggregSec s=new AggregSec(11,22,n);
		s.display();
	}

}
