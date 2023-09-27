public class SampleReturn1
{
public int compareNumbers(int x, int y)
{
System.out.println("x="+x+"y="+y) ;
 if (x>y)
 return x;
 else
 return y;
 }
 public static void main(String[]args)
 {
 SampleReturn1 obj=new SampleReturn1();
 int result=obj.compareNumbers(20,30);
 System.out.println("greatest number among x and y is="+result) ;
 }
 
 }
 
 