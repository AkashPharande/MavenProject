package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example6_LinkedHashset {
	
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Akash");
		lhs.add(101);
		lhs.add('A');
		lhs.add(79.63f);
		lhs.add(null);
		lhs.add(101);
		lhs.add(null);
		
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(101));
		
		lhs.remove('A');
		System.out.println(lhs);
		
		System.out.println("--print all data from hashset using Iterator--");

		Iterator itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--print all data using foreach--");
		for(Object s1:lhs) {
			System.out.println(s1);
		}

		

		
	}

}
