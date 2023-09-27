class ConstructorsDemo
{
int rollNumber();
String age();
String address;


public ConstructorsDemo()

{
this.rollNumber=10;
this.age=18;
this.adress=pune;
}

ConstructorsDemo(int rollNumber,String age, String adress)
{
this.rollNumber=rollNumber;
this.age=age;
this.adress=adress;	
}


public static void main(String[]args)
{

ConstructorsDemo s1=new ConstructorsDemo();
s1.ConstructorsDemo();
System.out.println("students info is"+ s1.rollNumber);

}
}
	