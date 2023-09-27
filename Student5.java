class Student5{  
int rollno;  
String name;  
float fee;  
Student5(int r,String n,float f){  
rollno=r;  
name=n;  
fee=f;  
} 
Student5(int r,String n){ 
this.rollno=r;
this.name=n;
}
Student5(String n){ 

this.name=n;
}

void display()
{System.out.println(rollno+" "+name+" "+fee);}  
  
public static void main(String args[]){  
Student5 s1=new Student5(111,"ankit",5000f);  
Student5 s2=new Student5(112,"sumit",6000f);  
Student5 s3=new Student5(113,"maithili"); 
Student5 s4=new Student5("juii");  
s1.display();  
s2.display(); 
s3.display();  
s4.display();  
}}  