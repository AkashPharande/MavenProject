package Exception_Handling;

public class Example2 {
	
public static void main(String[] args) {
		
		String s1="abcd";
		try
		{
		System.out.println(s1.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception Handled");
		}
		
		System.out.println("hii");
		System.out.println("hello");
	}


}
