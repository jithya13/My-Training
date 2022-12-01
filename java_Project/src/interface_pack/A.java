package interface_pack;

public class A implements B{
	
	public void print() {
		System.out.println("Hello world");
		
	}

	public static void main(String[] args) {
		B a=new A();
		a.print();
	}

}
