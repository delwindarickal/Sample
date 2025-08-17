package assignment8;

public class FullTimeEmployee extends Employee {
final int h=8;
	public FullTimeEmployee(int payment) {
        super(payment);
    }

    public int calculateSalary() {
        return payment * h;
    }
    
    public static void main(String[] args) {
        Contractor c = new Contractor(850, 6);        
        FullTimeEmployee f = new FullTimeEmployee(1000); 

        System.out.println("Contractor Salary: " + c.calculateSalary());
        System.out.println("Full-time Employee Salary: " + f.calculateSalary());
    }
}


