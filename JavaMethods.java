public class JavaMethods {

	public static void main(String[] args) {

		//call the method. the method will return
// string value
		//Store that in a variable of string type
		String name = myMethod();
		
		System.out.println("My name is :" + name);
	}
	
	public static String myMethod() {
		
		String name = "Rakesh Singh";
		return name;
	}	
	
}