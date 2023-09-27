public class TestBlock extends Parent
{
static

{ System.out.println("inside static block-222");
}

public TestBlock()
{
	super();
	System.out.println("inside TestBlock() no arg consructor");
	
}
{
	
	System.out.println("inside instance block -111");
}
static {
	System.out.println("inside static block-111");
}
{
	System.out.println("inside instance block -222");
}
	
	public static void printHello()
	{
		
	System.out.println("inside printHello() ");
	}
	public void printHii()
	{
		System.out.println("inside printHii() ");
	}
	public static void main(String[]args)
	{
		System.out.println("inside main method ");
	  
	  TestBlock obj1=new TestBlock();
	  printHello();
	  obj1.printHii();
	  
	}
}

