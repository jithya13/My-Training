package mulilevel_pack;

public class Bike extends Vehicle {
	String brand ="Hero Honda";
	public void bike_display()
	{
		System.out.println("Brand="+brand);
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.display();
        b.bike_display();
	}

}
