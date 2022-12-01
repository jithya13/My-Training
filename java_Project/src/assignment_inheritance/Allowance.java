package assignment_inheritance;

public class Allowance extends Employee_basic {
	int hra=0, pf=0;
	public void calc_hra()
	{
		hra=(5*basic_pay)/100;
	}
	public void calc_pf()
	{
		pf=(20*basic_pay)/100;
	}

}
