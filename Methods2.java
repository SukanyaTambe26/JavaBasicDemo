public class Methods2
{
public static int add(int a, int b)
{
	int res= a+b ;
	return res;
}
public static void main(String[]args)
{
	Methods2 obj=new Methods2();
	
	int res=obj.add(20,50);
	System.out.println("the addittion is" + res);
}

}
