package StringList;
import java.util.*;
public class AarryList {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(5);
		a.add("hello");
		a.add(null);
		a.add(19.272);
		
		System.out.println("ArryList " + a);
		
		//using get();
		for(int i=0 ; i<a.size() ; i++) {
			System.out.println(a.get(i));
		}
		System.out.println("-------------------------");
		
		//using for each loop
		for(Object o : a) {
			System.out.println(o);
		}
		System.out.println("----------------------");
		
		//using iterator
		
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		// using Listiterator
		ListIterator j = a.listIterator();
		while(j.hasPrevious()) {
			System.out.println(j.previous());
		}
		
		/*
		System.out.println("-------------Sorting String---------");
		
		Collections.sort(a);
		System.out.println(a);
	
		*/
		System.out.println("-------------Reverse String---------");
		
		Collections.reverse(a);
		System.out.println(a);
	
	}

}
