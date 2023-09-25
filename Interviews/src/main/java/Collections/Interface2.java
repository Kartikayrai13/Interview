package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Interface2 {
public static void main(String[] args) {
	List l = new LinkedList();
	l.add(4);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(null);
	l.add("add");
	
	//Collections.sort(l);
	Iterator it = l.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//System.out.println(l.remove(0));//returns the object removed
	//System.out.println(l);
	//System.out.println(l.size());//returns the size
	//System.out.println(l.contains(3));//returns true if element is present
	//System.out.println(l.isEmpty());//returns boolean
	//System.out.println(l.get(1));//returns the element on the index entered
	//System.out.println(l.getClass());
		
	Vector v = new Vector();
	v.add(12);
	v.add(9);
	v.add(23);
	v.add(null);
	v.add("add");
	v.add(9);
	System.out.println(v);
	
	
	
	Stack s = new Stack();
	s.add(5);
	s.push(12);
	s.push(1);
	s.push(null);
	s.push("add");
	s.push(12);
	System.out.println(s);



}
}
