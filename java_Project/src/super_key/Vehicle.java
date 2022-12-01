package super_key;

public class Vehicle 
{
	String color ="Red";
public void printcolor() 
{
	System.out.println(color);
}
void printmethod()
{
	System.out.println("Print method body using super");
}
Vehicle()
{
	System.out.println("Print parent constructor");//called parent constructor
}
}
