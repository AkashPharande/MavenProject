package Array;

import java.util.Arrays;

public class example7_findinghighestandlowestno {
	
	public static void main(String[] args) {
		
		int [] ar1=new int[4];
		ar1[0]=30;
		ar1[1]=20;
		ar1[2]=40;
		ar1[3]=10;
		
		Arrays.sort(ar1);
		System.out.println(ar1[0]);
		System.out.println(ar1[ar1.length-1]);
		
	}
}
