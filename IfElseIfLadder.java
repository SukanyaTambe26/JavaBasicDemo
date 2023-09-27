public class IfElseIfLadder
{
	public static void main(String[]args)
	{
		int marks=108;
		if ((marks>=50) && (marks<=60))
		{
			System.out.println(" c grade");
		}
		else if ((marks>=61) && (marks<=70))
			
			{
				System.out.println(" b grade");
			}
			else if ((marks>=71) && (marks<=100))
			
			{
				System.out.println(" a grade");
			}
			
			else 
				{
				System.out.println(" marks are invalid");
			}
	}
}

