package Collections;

import java.util.Enumeration;
import java.util.Stack;

public class Stack2 {
public static void main(String[] args) {
	Stack s = new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	//System.out.println(s);
	
	//System.out.println(s.peek());
	//s.pop();
	//s.pop();
//System.out.println(s);
	Enumeration e =s.elements();
	//for(e.hasMoreElements();;) {
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	}
}

