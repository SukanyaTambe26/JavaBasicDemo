public class Static_nonstatic_methodsDemo
{
public void m1()
{
System.out.println("m1() method started");
m3();
System.out.println("m1() method ended");
}
public static void m2()
{System.out.println("m2() method started");
}
public void m3()
{System.out.println("m3() method started");
}
public static void main(String[] args)

{System.out.println("main method started");

Static_nonstatic_methodsDemo obj=new Static_nonstatic_methodsDemo();

obj.m1();
System.out.println("main method ends");
}
}

