package Collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FastSafe {
public static void main(String[] args) {
	ConcurrentHashMap c = new ConcurrentHashMap();
	c.put(12,"Abc");
	c.put(13,"Def");
	c.put(9, "asd");
	System.out.println(c);
	
	Iterator it = c.keySet().iterator();
	c.put(15, "aap");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
