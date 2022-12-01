package super_key;

public class Car extends Vehicle{
 String color="Black";
	public static void main(String[] args) {
		Car c=new Car();//calling constructor
		c.printcolor();
		c.display();
			
	}
	void display()
	{
		super.printmethod();	//call methods in parent class
	}
	Car()
	{
		//here default super constructor is invoked
		//by default super(); is called here
		System.out.println("Print car constructor");
	}
	public void printcolor() {
		System.out.println(super.color); //call variables in parent class
		System.out.println(color);
	}
	
	
}
