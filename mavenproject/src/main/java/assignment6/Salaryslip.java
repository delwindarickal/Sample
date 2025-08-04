package assignment6;
//class 3
public class Salaryslip extends SalaryCalc {
	
	public void salary(double basic,double deduction,double bonus) {
	    
		super.empsalarycalc(basic, deduction, bonus);
		double totalsalary;
		totalsalary= basic+hra-pf-deduction+bonus;
		System.out.println("---------SALARY SLIP-----------");
		System.out.println("Basic Pay:"+basic);
		System.out.println("Deduction: " +deduction);
	    System.out.println("HRA (5%): " +super.hra);
	    System.out.println("PF (20%): "+super.pf);
	    System.out.println("Bonus: " +bonus);
	    System.out.println("-------------------------------");
	    System.out.println("Total In-Hand Salary :  " +totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Salaryslip s=new Salaryslip();
s.salary(15000,750,1500);
	}

}
