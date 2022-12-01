package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3_LinkedList {
	public static void main(String[] args) {
		LinkedList LL= new LinkedList();
		LL.add("Akash");
		LL.add(101);
		LL.add('A');
		LL.add(79.63F);
		LL.add(101);
		LL.add(null);
		LL.add(null);
		
		
		System.out.println(LL);
		System.out.println(LL.size());
		System.out.println(LL.isEmpty());
		System.out.println(LL.contains(101));
		System.out.println(LL.get(2));
		
		System.out.println(LL);
		//add info in between linkedlist
		LL.add(4, 500);
		System.out.println(LL);
		
		//remove/delete info in between linkedlist
		LL.remove(4);
		System.out.println(LL);
		
		//modify/update info
		LL.set(0, "Aniket");
		System.out.println(LL);
		System.out.println("--print all data using iterator cursor--");
		Iterator itr = LL.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("--print all data using listiterator--");
		ListIterator litr = LL.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
			
		}
		System.out.println("--print all data using for loop--");
		for(int i=0; i<=LL.size()-1;i++)
		{
			System.out.println(LL.get(i));
		}
		System.out.println("--Using foreach--");
		for(Object s1:LL)
		{
			System.out.println(s1);
		}
		
	
	}

}
