package String_class;

public class split {
	
	public static void main(String[] args) {
		String s1="my name is abc";
		String [] ar =s1.split(" ");
		
		System.out.println(ar.length);
		
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.println(ar[i]);
			
		}
	}

}
