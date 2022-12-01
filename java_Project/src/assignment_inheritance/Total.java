package assignment_inheritance;

public class Total extends Allowance {
	int Total;
	public void total()
	{
		Total=basic_pay-deductions+bonus+hra-pf;
		System.out.println("Total Salary="+Total);
	}

	public static void main(String[] args) {
		Total t=new Total();
		t.getdata();
		t.calc_pf();
		t.calc_hra();
		t.total();
		System.out.println("Salary Slip");
		System.out.println("Basic Pay ="+t.basic_pay);
		System.out.println("Deduction="+t.deductions);
		System.out.println("HRA="+t.hra);
		System.out.println("PF="+t.pf);
		System.out.println("Bonus="+t.bonus);
		System.out.println("Total="+t.Total);
	}

}
