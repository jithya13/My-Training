package assignment_encapsulation;

public class User {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setPin_number(1234);
        b.validate_pin();
	}

}
