package Array;

public class example1_String {
	
	public static void main(String[] args) {
		//step 1: Array Declaration
		String [] ar=new String[5];
		
		//step 2:Array Initialization
		ar[0]="Akash";
		ar[1]="Aniket";
		ar[2]="Chaitali";
		ar[3]="Shreyas";
		ar[4]="Aishwarya";
		
		//step 3:Array Usage
		
		System.out.println(ar[0]);
		System.out.println(ar.length);
		
		System.out.println("---print all info in array---");
		for(int i=0; i<=4; i++)
		{
			System.out.println(ar[i]);
		}
	}

}
