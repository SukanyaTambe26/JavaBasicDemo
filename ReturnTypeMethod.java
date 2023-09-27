public class ReturnTypeMethod

{
	public int addition(int a, int b)
	{
		
		System.out.println("Addition method started");
		int res=a+b;
		System.out.println("Addition method ended");
		return res;
	}
	
		public static void main(String[]args)
		{
	System.out.println("main method started");
	ReturnTypeMethod obj=new ReturnTypeMethod();
	int returnedValue=obj.addition(50,60);
	System.out.println("Addition is: "+ returnedValue);
	System.out.println("main method ended");
	
	}
}

	