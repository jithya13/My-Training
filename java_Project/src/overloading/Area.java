package overloading;

public class Area {
	
		public static void main(String args[])
		{
		area();
		System.out.println("Area of Circle="+area(6));
		System.out.println("Area of Rectangle="+area(5,6));
		}

		static void area()
		{
		System.out.println("Find Area");
		}
		static double area(double a)
		{
		double area=3.14*a*a;
		return area;
		}
		static double area(int a,int b)
		{
		int area=a*b;
		return area;
		}
		}



