class Student1
{ 
int roll;
int age;
String adress1;
String adress2;

Student1()
{
}

Student1(int roll, int age, String adress1, String adress2)
{
 this.roll=roll;
 this.age=age;
 this.adress1=adress1;
 this.adress2=adress2;
 }
 
 public static void main(String[]args)
 {
 Student1 p1=new Student1(5, 25, "kolhapur", "pune");
 System.out.println(p1.roll);
 System.out.println(p1.age);
 
 System.out.println(p1.adress1);
 
 System.out.println(p1.adress2);
 
 Student1 p2=new Student1(6, 26, "mumbai", "parner");
 Student1 p3=new Student1(7, 30, "nashik", "sangamner");
 Student1 p4=new Student1(8, 35, "agra", "parali");
 Student1 p5=new Student1(9, 40, "thane", "beed");
 
 System.out.println(p2.roll);
 System.out.println(p2.age);
 System.out.println(p2.adress1);
 System.out.println(p2.adress2);
 
 System.out.println(p3.roll);
 System.out.println(p3.age);
 System.out.println(p3.adress1);
 System.out.println(p3.adress2);
 
 
 System.out.println(p4.roll);
 System.out.println(p4.age);
 System.out.println(p4.adress1);
 System.out.println(p4.adress2);
 
 
 System.out.println(p5.roll + p5.age + p5.adress1 + p5.adress2);
 
 
 
 }
 }
 
 
 
 