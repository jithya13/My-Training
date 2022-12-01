package inheritance_pack;

public class HR_Manager extends Manager {
 int HR_allowances=2000;
	public static void main(String[] args) {
		HR_Manager h=new HR_Manager();
		System.out.println("Basic pay="+h.basic_pay);
		System.out.println("Bonus="+h.bonus);
		System.out.println("Allowance="+h.HR_allowances);
	}

}
