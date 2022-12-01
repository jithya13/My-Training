package aggregation;

public class Circle {

	double pi=3.14;
	Operation op;
	
	double area(int r)
	{
		op=new Operation();
		int value=op.square(r);
		return pi*value;
	}
	
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println("Area of circle="+c.area(5));

	}

}
