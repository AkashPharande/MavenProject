package Exception_Handling;

public class Example1 {
	
	
	public static void main(String[] args) 
	{
		int [] ar=new int [4];   //0 to 3 index
		
		
		try
		{
			ar[5] =10;     //risky code
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		
		
		
		
		
		System.out.println("hi");
		System.out.println("hello");
		
		
		
		
	}

}
