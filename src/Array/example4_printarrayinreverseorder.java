package Array;

public class example4_printarrayinreverseorder {
	
public static void main(String[] args) {
		
		
		int [] ar1=new int[4];
		
		ar1[0]=30;
		ar1[1]=20;
		ar1[2]=10;
		ar1[3]=40;
		
		System.out.println("---print original data---");
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar1[i]);
		}
		
		System.out.println("---print array in reverse order");
		
		for(int i=3; i>=0; i--)
		{
			System.out.println(ar1[i]);
		}
	}

}
