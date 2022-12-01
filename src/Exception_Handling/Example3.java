package Exception_Handling;

public class Example3 {
public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		int div=0;
		try
		{
		div=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		System.out.println("GM");
	}

}
