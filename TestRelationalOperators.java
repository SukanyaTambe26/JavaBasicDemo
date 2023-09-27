public class TestRelationalOperators
{
	public static void main(String[]args)
	{
		Integer a=new Integer(127);
		Integer b=127;
		
	boolean res= a==b;
	System.out.println(res);
	
	Integer c=127;
	Integer d=127;
	
	boolean res1= c==d;
	
	System.out.println(res1);
	
	int x=5;
	int y=10;
	
	boolean res3=(x<y) || (y>x);
	System.out.println(res3);
	
	System.out.println(!(5==10));
	
	System.out.println(x++);
	
	
	System.out.println(++x);
	
	
	}
}
