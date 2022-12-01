package assignment_super;

public class Result extends Add {
	int result;
	public void check_result()
	{
		 result =super.addition(13,5);
		if(result%10==0)
		{
			System.out.println("Number is divisible by 10");
			
		}
		else
		{
			System.out.println("Number is  not divisible by 10");
		}
	}

	public static void main(String[] args) 
	{
		Result r=new Result();
		r.check_result();
	}

}
