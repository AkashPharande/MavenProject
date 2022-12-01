package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector {
	public static void main(String[] args) {
		Vector V=new Vector();
		V.add("Akash");
		V.add(101);
		V.add('A');
		V.add("Akash");
		V.add(null);
		V.add(null);
		
		System.out.println(V.capacity());
		System.out.println(V);
		System.out.println(V.size());
		System.out.println(V.isEmpty());
		System.out.println(V.contains(101));
		System.out.println(V.get(3));
		

		//add info in between Vector --->Right shift operation
		System.out.println(V);
		V.add(4, "Aniket");
		System.out.println(V);
		
		//remove info in between Vector  --->left shift operation
		V.remove(4);
		System.out.println(V);
		
		//update/modify info from Vector
				V.set(1, 102);
				System.out.println(V);
				
				System.out.println("--print all the data from Vector using iterator cursor--");
				Iterator VI=V.iterator();
				
				while (VI.hasNext()) {
					System.out.println(VI.next());
				}
				System.out.println("--print all the data from Vector using listiterator cursor--");
				ListIterator LVI=V.listIterator();
				while (LVI.hasNext()) {
					
					System.out.println(LVI.next());
					
				}
				
				System.out.println("--print all the data using for loop--");
				for (int i = 0; i <=V.size()-1; i++) {
					System.out.println(V.get(i));
					
				}
				System.out.println("--print all the data using foreach loop--");
				for(Object s1:V)
				{
					System.out.println(s1);
				
				}
				
				System.out.println("--print all data using enumeration cursor--");
				Enumeration enu = V.elements();
				
				while (enu.hasMoreElements()) {
					
					System.out.println(enu.nextElement());
					
				}
		
	}

}
