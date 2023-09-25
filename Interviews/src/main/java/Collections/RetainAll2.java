package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class RetainAll2 {
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		s.add("Bag");
		s.add("Book");
		ArrayList<String> a = new ArrayList<String>();
		a.add("Bag");
		a.add("Pen");
		//a.retainAll(s);
		s.retainAll(a);
		
		System.out.println(s);
		System.out.println(a);
	}
}
