package review_pack;

import java.util.Scanner;

public class MiddleString {
	 static String str;;
	 static int middle;
	private static Scanner s;
	 
	 public static void display()
	 {
		 
		 int length=str.length();
		  middle=str.length()/2;
		 if(length%2!=0)
		 {
		 System.out.println(str.charAt(middle));
		 }
		 else
		 {
			 System.out.print(str.charAt(middle-1)); 
			 System.out.print(str.charAt(middle)); 
		 }	 
	 }
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.next();
		display();
		
		

	}

}
