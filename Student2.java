class Student2
{ 
int roll;
int age;
String adress1;
String adress2;

Student2()
{
}
Student2(int roll)
{
 this.roll=roll;
 }

Student2(int roll, int age)
{
 this.roll=roll;
 this.age=age;
 
 }

Student2(int roll, int age, String adress1)
{
 this.roll=roll;
 this.age=age;
 this.adress1=adress1;
 
 }
 Student2(int roll, String adress1, String adress2)
{
	this.roll=roll;
 
 this.adress1=adress1;
 this.adress2=adress2;
 }
Student2(int roll, int age, String adress1, String adress2)
{
 this.roll=roll;
 this.age=age;
 this.adress1=adress1;
 this.adress2=adress2;
 }
 
 public static void main(String[]args)
 {
 Student2 p1=new Student2(5, 25);
 System.out.println(p1.roll);
 System.out.println(p1.age);
 
 
 
 Student2 p2=new Student2(6);
 Student2 p3=new Student2(7,  "nashik", "sangamner");
 Student2 p4=new Student2(8, 35, "agra", "parali");
 Student2 p5=new Student2(9, 40, "thane", "beed");
 
 System.out.println(p2.roll);
 
 System.out.println(p3.roll);
 System.out.println(p3.adress1);
 System.out.println(p3.adress2);
 
 
 System.out.println(p4.roll);
 System.out.println(p4.age);
 System.out.println(p4.adress1);
 System.out.println(p4.adress2);
 
 
 System.out.println(p5.roll + p5.age + p5.adress1 + p5.adress2);
 
 
 
 }
 }