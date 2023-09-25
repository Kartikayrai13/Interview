package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class FastFail {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	Iterator it = a.iterator();
	a.add(4);
	while(it.hasNext()) {
		System.out.println(it.next());

	}
}
}
