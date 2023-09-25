package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class FailSafe2 {
public static void main(String[] args) {
	Stack a = new Stack();
	a.add(1);
	a.add(2);
	a.add(3);
	Enumeration e = a.elements();
	a.add(4);
	for(e.hasMoreElements();;) {
		System.out.println(e.nextElement());
	}
}
}
