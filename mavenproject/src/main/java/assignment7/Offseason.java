package assignment7;

public class Offseason extends Onseason {
	char c='n';// o- Offseason, n- Onseason
	public void discount(float amount) {
		if(c=='o'){
        float discount = amount * 0.15f;  // 15% discount
        float total = amount - discount;

        System.out.println("Offseason Purchase:");
        System.out.println("Original Price: Rs. " +amount);
        System.out.println("Discount (15%): Rs. " +discount);
        System.out.println("Final Price: Rs. " +total);
		}
		else if(c=='n') {
			super.discount(amount);
		}
	}
public void season() {
		super.discount(1000);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
Offseason s=new Offseason();
	s.discount(1000);


	}

}
