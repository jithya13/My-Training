package final_pack;

public class Hero extends Bike{ // can't create subclass for final class

	 void run() // can't override final method
	  {
		System.out.println("Bike class");
	  }
	
public static void main(String[] args) {
		
	Hero h=new Hero();
	h.run();
	}
}
