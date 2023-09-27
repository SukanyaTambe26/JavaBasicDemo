class StudentNew{
	int rollno;
	String name;
	static String college="MMCOE";
	
	StudentNew(int rn,String nm)
	{
		this.rollno=rn;
		this.name=nm;
		
	}
	
	
	
	public static void main(String[]args)
	{
		 StudentNew s1=new  StudentNew(11,"karan");
		 StudentNew s2=new  StudentNew(21,"arjun");
		 
		
	 
		 System.out.println(s1.rollno+s1.name+college);
		System.out.println(s2.rollno+s2.name+college);
		 
		 
	}
}
