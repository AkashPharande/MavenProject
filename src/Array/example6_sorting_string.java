package Array;

import java.util.Arrays;

public class example6_sorting_string {
	
	public static void main(String[] args) {
	
		String [] ar=new String[5];
		
	
		ar[0]="Akash";
		ar[1]="Aniket";
		ar[2]="Chaitali";
		ar[3]="Shreyas";
		ar[4]="Aishwarya";
		
		System.out.println("---original data---");
		for (int i = 0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		
			
		}
		Arrays.sort(ar);
		System.out.println("---After sorting---");
		for (int i = 0; i <=ar.length-1; i++) {
			System.out.println(ar[i]);
			
		}
	}

}
