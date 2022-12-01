package inheritance_pack;

public class Manager extends Employee {
int bonus=5000;
	public static void main(String[] args) {
		Manager e= new Manager();
		e.display();
		System.out.println("Basic Pay:"+e.basic_pay);
		System.out.println("Bonus:"+e.bonus);
		
	}

}
