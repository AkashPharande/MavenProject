package Exception_Handling;

public class Example6 
{
	public static void main(String[] args) {
		
		int a=50;
		int b=0;
		
		int c=b/a;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		System.out.println("hii");
	}
	

}
