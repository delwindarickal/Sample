package assignment8;

public class User extends Bank{

	private int balance;

   
    public void  userbal(int balance) {
        this.balance = balance;
    }

    
    public void withdraw(int amount) {
        if (super.validatePin()) {
            if (amount <= balance) {
                balance = balance- amount;
                System.out.println("Withdrawal of " +amount+ " successful.....");
                System.out.println("Remaining balance: " +balance);
            } 
            else {
                System.out.println("Insufficient balance!");
            }
        } 
        else {
            System.out.println("Invalid PIN.!!");
        }
    }

   
    public static void main(String[] args) {
        
        User u = new User();
        u.userbal(10000);
        u.setPin(1001);   
        u.withdraw(500);
    }
}

