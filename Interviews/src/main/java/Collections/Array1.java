package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	System.out.println(a);
	a.removeAll(a);
System.out.println(a.add(1)|a.add(2)|a.add(3));
//	Iterator it = a.iterator();
//	while(it.hasNext()) {
//		System.out.print(it.next());
		
		for(Object b:a) {
			System.out.print(b);
		}
	}
}


