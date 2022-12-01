package stud_pack1;

import java.util.Scanner;

public class Stud1 {

		int id;
		String Name ;
		static String college;
      public void getdata()
      {
         Scanner s =new Scanner(System.in);
		 System.out.println("Enter id");	 
		 id=s.nextInt();
		 System.out.println("Enter Name");	 
		  Name=s.next();	
		 System.out.println("Enter college");	 
		 college=s.next();	
}


		public  void display()
		{
		System.out.println("id="+id);
		System.out.println("Name="+Name);
		System.out.println("College="+college);
		}
		}

