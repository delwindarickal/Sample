package assignment6;
//class 2
public class SalaryCalc extends Employeepay {
	double hra,pf;
	public void empsalarycalc(double basic,double deduction,double bonus) {
		super.emppay(basic,deduction,bonus);
		this.hra= basic * 0.05;
        this.pf = basic * 0.20;
	}

}
