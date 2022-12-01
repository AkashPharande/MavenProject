package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example4_Hashset1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(123);
		hs.add("Akash");
		hs.add(101);
		hs.add('A');
		hs.add(79.63f);
		hs.add(44.44f);
		hs.add(null);
		hs.add(101);
		hs.add(null);
		
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(101));
		
		
		//remove info from hastset
		hs.remove('A');
		System.out.println(hs);
		
		System.out.println("--print all data from hashset using Iterator--");
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("--print all data using foreach--");
		for(Object s1:hs) {
			System.out.println(s1);
		}
	}

}
