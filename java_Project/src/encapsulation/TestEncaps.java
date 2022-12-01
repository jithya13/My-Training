package encapsulation;

public class TestEncaps {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		s.setName("Jithya");
		s.setcollege("Assumption");
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getcollege());

	}

}
