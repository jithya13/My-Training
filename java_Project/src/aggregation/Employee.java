package aggregation;

public class Employee {
int id;
String name;
Address address;

Employee(int a,String b,Address address)
{
	id=a;
	name=b;
	this.address=address;
	
}
public void display()
{
	System.out.println("id="+id);
	System.out.println("Name="+name);
	System.out.println("City="+address.city);
	System.out.println("Country="+address.country);
	System.out.println("State="+address.state);
	System.out.println("Zipcode="+address.zipcode);
}


public static void main(String args[])
{

Address a=new Address("Kollam","Kerala","India",691503);
Employee e=new Employee(121,"Jithya",a);	
e.display();
}
}
