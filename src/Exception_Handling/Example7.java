package Exception_Handling;

public class Example7 {
	public static void main(String[] args) 
	{
	String a1="sjdhfnvjfhdnfj";
	
		
		try
		{
			System.out.println(a1.charAt(25));
		}
		catch(StringIndexOutOfBoundsException A) {
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		System.out.println("hello");
		System.out.println("good morning");
		
		
	}

}
