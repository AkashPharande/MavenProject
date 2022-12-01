package Exception_Handling;

public class Example5 {
	
	public static void main(String[] args) 
	{
		int [] ar=new int [4];   //0 to 3 index
		
		
		try
		{
			ar[5] =10;     //risky code
			
		}
		
	
		catch(Exception b) 
		{
			b.printStackTrace();
			System.out.println("Generic Exception Handled");
			
		}
		
		System.out.println("hi");
		System.out.println("hello");
		
		
		
		
	}

}
