package Collections;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafe {
public static void main(String[] args) {
	ArrayBlockingQueue a = new ArrayBlockingQueue(5);
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(0);
	//a.add(4);
	System.out.println(a);
	a.remove();
	System.out.println(a);
	Iterator it = a.iterator();
	a.add(4);
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	
}
}
