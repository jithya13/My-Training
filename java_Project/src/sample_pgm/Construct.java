package sample_pgm;

public class Construct {
	int Length,Breadth,Area;
	
	Construct()
	{
		System.out.println("Print Area");
	}
	Construct(int l,int b)
	{
		this();
		Length=l;
		Breadth=b;
		
	}
	public void display()
	{
		Area=Length*Breadth;
		System.out.println("Area="+Area);
	}

	public static void main(String[] args) 
	{
		Construct c= new Construct(5,3);
           c.display();
	}
}
