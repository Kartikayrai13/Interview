package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Interface3 {
public static void main(String[] args) {
	//Set s = new HashSet();//null values and unique elements
	//HashSet s = new HashSet();//null values and unique elements and acending order
	LinkedHashSet s = new LinkedHashSet();
	//s.add("zero");
	//s.add("five");
	//s.add("three");
	s.add(4);
	s.add(45);
	s.add(1);
	s.add(5);
	s.add(78);
	s.add(23);
	s.add("abc");
	//s.add("s");
	//Collections.synchronizedSet(s);

	

//	
//	Iterator it = s.iterator();
//	while(it.hasNext()) {
//		//String str =(String)it.next();
//		System.out.println(it.next());
//	}
	
	//s.add(null);
	//s.add("asd");
	//s.add(null);
	System.out.println(s);
	//System.out.println(s.remove(0));//returns boolean if element not found in the collection 
	//System.out.println(s);
	//System.out.println(s.isEmpty());//returns boolean
	//System.out.println(s.size());//returns the number of elements present
	//System.out.println(s.getClass());//returns class name 
	
	
	SortedSet s1 = new TreeSet();
	//s1.add(5);//unique element and acending order
	//s1.add(4);
	//s1.add(1);
	s1.add("abc");
	s1.add("cdf");
	s1.add("der");
	s1.first();
	s1.last();
	//s1.add(null);no null
	System.out.println(s1.last());

	
	
}
}
