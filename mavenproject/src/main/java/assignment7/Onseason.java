package assignment7;

public class Onseason {
	 public void discount(float amount) {
	        float discount = amount * 0.40f;  // 40% discount
	        float total = amount - discount;

	        System.out.println("Onseason Purchase:");
	        System.out.println("Original Price: Rs. " +amount);
	        System.out.println("Discount (40%): Rs. " +discount);
	        System.out.println("Final Price: Rs. " +total);

}
}
