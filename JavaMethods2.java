public Class JavaMethods2
{
public static int add(int a, int b)
{
	int res= a+b ;
	return res;
}
public static void main (String[]args)
{
	JavaMethods2 obj=new JavaMethods2();
	
	int res=obj.add(20,50);
	system.out.println("the addittion is" + res);
}

}
