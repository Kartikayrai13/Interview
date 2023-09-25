package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Interface5 {
public static void main(String[] args) {
	Map m = new HashMap();
	m.put(5, "kartik");
	m.put(2, "Aand");
	m.put(null, "Acx");
	m.put(1, "abc");
	System.out.println(m);
	//System.out.println(m.size());
	
	//System.out.println(m.remove(1));
	//System.out.println(m.get(2));
	//System.out.println(m.getClass());
	//System.out.println(m.containsKey(2));
	
	//HashMap h = new HashMap();
	//h.put(2, "acb");
	//h.put(1, null);
	//h.put(null, "bvc");
	//h.put(null, null);
	//h.put(3, "acb");
	//System.out.println(h);
	//h.keySet();
	
//	TreeMap h = new TreeMap();
//	h.put(2, "acb");
//	h.put(1, null);
//		//h.put(null, "bvc");
//		//h.put(null, null);
//		h.put(3, "acb");
//
//		
//		System.out.println(h);
//
//		Hashtable h = new Hashtable();
//		h.put(2, "acb");
//		//h.put(1, null);
//			//h.put(null, "bvc");
//			//h.put(null, null);
//			h.put(3, "acb");
//			h.put(5, "acb");
//			System.out.println(h);

			LinkedHashMap h =new LinkedHashMap();
			h.put(2, "acb");
			h.put(3, "acb");
			h.put(null, null);
			System.out.println(h);
			
			
}

}
