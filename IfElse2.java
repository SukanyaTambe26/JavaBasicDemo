class IfElse2
{
	public static void main(String[]args)
	{
		Double n1=10.0, n2=14.5, n3=15.7, largest;
		
		if(n1>=n2)
		{
			
			if(n1>=n3)
			{
				System.out.println("largest no is=:"+n1);
			}
			else 
			{ 
		
		     System.out.println("largest no is=:"+n3);
		}
		}
		
			
			else{
				if (n2>=n3)
				{
					System.out.println("largest no is=:"+n2);
				}
				else{
					System.out.println("largest no is=:"+n3);
				}
			}
		
	}
}
