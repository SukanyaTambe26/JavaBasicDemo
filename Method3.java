public class Methods3
{
public static int add(int a, int b)
{
	int res= a+b ;
	return res;
}
public static void main(String[]args)
{
	Methods3 obj=new Methods3();
	
	int res=obj.add(20,50);
	System.out.println("the addittion is" + res);
	square(res);
	
	
	
}
public static long square(int res)
{ 
long square =res*res;
System.out.println("the square is" + square);

}
}
