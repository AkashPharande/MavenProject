package Exception_Handling;

public class Example4 {
	
	public static void main(String[] args) 
	{
		int [] ar=new int [4];   //0 to 3 index
		
		
		try
		{
			ar[5] =10;     //risky code
			
		}
		
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBounds Exception Handled");
		}
		catch(ArithmeticException b) 
		{
			System.out.println("Arithmetic Exception Handled");
			
		}
		
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(Exception b) 
		{
			
			System.out.println("Generic Exception Handled");
			
		}
		
		
		
		
		
		System.out.println("hi");
		System.out.println("hello");
		
		
		
		
	}

}
