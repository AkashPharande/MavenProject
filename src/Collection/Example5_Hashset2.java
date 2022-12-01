package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Example5_Hashset2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Akash");
		al.add(101);
		al.add('A');
		al.add(79.63f);
		al.add("Akash");
		al.add(null);
		al.add(null);
		
		
		
		System.out.println(al);
		
		HashSet hs= new HashSet(al);
		System.out.println(hs);
		
	}

}
