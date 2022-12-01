package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1_ArrayList {
	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		ArrayList al=new ArrayList(8);
		al.add("Akash");
		al.add(101);
		al.add('A');
		al.add(79.63f);
		al.add("Akash");
		al.add(null);
		al.add(null);
		
		
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(101));
		System.out.println(al.get(3));
		
		//add info in between arraylist --->Right shift operation
		System.out.println(al);
		al.add(4, "Aniket");
		System.out.println(al);
		
		
		//remove info in between arraylist  --->left shift operation
		al.remove(4);
		System.out.println(al);
		
		//update/modify info from arraylist
		al.set(1, 102);
		al.set(0, "Matin");
		System.out.println(al);
		
		System.out.println("--print all the data from arraylist using iterator cursor--");
		Iterator itr=al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("--print all the data from arraylist using listiterator cursor--");
		ListIterator litr=al.listIterator();
		while (litr.hasNext()) {
			
			System.out.println(litr.next());
			
		}
		System.out.println("--print all the data using for loop--");
		for (int i = 0; i <=al.size()-1; i++) {
			System.out.println(al.get(i));
			
		}
		System.out.println("--print all the data using foreach loop--");
	
		for( Object s1:al)
		{
			System.out.println(s1);
		
		}

		

	}

}
