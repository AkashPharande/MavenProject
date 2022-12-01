package Array;

public class example9_declarationInitializationinsinglestep_String {
	
	public static void main(String[] args) {
		
		
		
		String[] ar= {"Akash", "Aniket","Chaitali","Aishwarya"};
		
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		
		System.out.println("---print all data---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}

}
