class AreaOfCircle
{

static double rad;
static double a;

	 AreaOfCircle(double radius, double ar)
	 
	 
	 {double rad=radius;
	  double a=ar;
}

	 
	 
	public static double circleArea(double rad)
	{

	 double a= (22*(rad)*(rad))/7 ;
	 return a;
		
	}


	
	public static  void  main(String[]args)
	{
		
		circleArea(25);
		 System.out.println("area of circle is"+a);
	}
}
