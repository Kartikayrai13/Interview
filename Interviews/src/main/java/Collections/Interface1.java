package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Interface1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();// incersion order duplicate allowed
		c.add(5);// null allowed
		c.add(2);
		c.add(null);
		c.add("Acd");
		c.add(5);
		
		
//	System.out.println(c.remove(1));//removes the element and returns true and false
		// System.out.println(c);
		// System.out.println(c.isEmpty());//returns boolean
		// System.out.println(c.size());//returns size of the collection
		// System.out.println(c.contains(3));//returns true if element is found in the
		// collection
		// System.out.println(c.getClass());//returns the class name in this case
		// java.util.ArrayList
		// System.out.println(c);
//Iterator it = c.iterator();
		// if(it.hasNext()) {

		// System.out.println(it.next());
		LinkedList l = new LinkedList();// incersion order null allowed string in iint allowed
		l.add(5);
		l.add(4);
		l.add(1);
		l.add(5);
		l.add(null);
		l.add("add");
		//l.push(12);
		//l.add(null);
		//l.add("null");
	
		//Collections.sort(l);
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		
		}
		
	}
}
