package assignment8;

public class HDFC implements RBI {

	public double recurringdeposit(double deposit, int duration) {
        double interest = (deposit * interestper * duration) / 100;
        double maturityamount = deposit + interest;
        return maturityamount;
    }

    public static void main(String[] args) {
        HDFC c = new HDFC();
        double deposit = 10000; 
        int years = 2;               

        double maturity = c.recurringdeposit(deposit, years);

        System.out.println("Deposit: ₹" + deposit);
        System.out.println("Duration: " + years + " yrs");
        System.out.println("Maturity Amount: ₹" + maturity);
    }}
