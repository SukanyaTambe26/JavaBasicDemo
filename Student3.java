public class Student3 extends Person
{
	int roll;
	String name;
	 public Student3()
	 {
		 super(10,10,10);
	 }
	 
	 public Student3(int roll, String name)
	 {
		 this(roll, name, 6, 67, 30);
		 int roll=roll;
		 String name=name;
		 
		 
		 this.roll=roll;
		 this.name=name;
	 }
	 public Student3(int height, int weight, int age, int roll,  String name )
	 {
		 this.age=age;
		 this.name=name;
		 this.weight=weight;
		 this.height=height;
		 this.roll=roll;
	 }

}
		 