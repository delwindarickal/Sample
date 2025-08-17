package assignment8;

public class Contractor extends Employee {

	private int workinghrs;   

    
    public Contractor(int payment, int workinghrs) {
        super(payment);
        this.workinghrs = workinghrs;
    }

   
    public int calculateSalary() {
        return payment * workinghrs;
    }
}



