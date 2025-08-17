package assignment8;

public abstract class Employee {
	int  payment; 

   
    public Employee(int payment) {
        this.payment = payment;
    }

    public abstract int calculateSalary();

    }


