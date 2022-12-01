package assignment_aggregation;

public class Student {
	
	int rollno;
	String name;
	StudAddress address;
	
	Student(int n,String m,StudAddress a)
	{
		rollno=n;
		name=m;
		this.address=a;
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("RollNo="+rollno);
		System.out.println("City="+address.city);
		System.out.println("State="+address.state);
		System.out.println("Country="+address.country);
		System.out.println("Zipcode="+address.zipcode);
	}
	public static void main(String[] args)
	{
		StudAddress a=new StudAddress("Kollam","Kerala","India",691503);
		Student s=new Student(20231,"Susan",a);
		s.display();
	}
}
