package assignment8;

public class Bank {
	private int pin;   
    private int pins[] = {1001, 1234, 1212};

    
    public void setPin(int pin) {
        this.pin = pin;
    }

    
    public boolean validatePin() {
        for (int p : pins) {
            if (p == pin) {
                return true;
            }
        }
        return false;
    }
}
