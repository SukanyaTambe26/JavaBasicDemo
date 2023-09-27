import java.util.Scanner;
public class SwitchCaseDemo{
	public static void main(String[]args)
	{
		System.out.println("please enter size in number:");
		
		Scanner sc=new Scanner(System.in);
		 int size=sc.nextInt();
		 System.out.println("you have entered size:"+size);
		 
		 
		 switch (size)
		 {
			 case 28:
			 System.out.println("small");
			 break;
			 case 30:
			 System.out.println("medium");
			 break;
			  case 32:
			 System.out.println("large");
			 break;
		     case 34:
			 System.out.println("extra large");
			 break;
		 
		 default:
		 System.out.println("size is invalid");
		 }
		 
	}
	
}

		 
			 