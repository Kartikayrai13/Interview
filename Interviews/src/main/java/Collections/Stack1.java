package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
		Stack s =new Stack();
		for(char i='a';i<='z';i++) {
			System.out.print(s.push(i));
			
			
		}
		
		System.out.println("-----------------------------------------------------");
		
		Stack r=new Stack();
		while(!s.isEmpty()) {
			System.out.print(r.push(s.pop()));
			
		}
		
		System.out.println("-----------------------------------------------------");
		
		while(!r.isEmpty()) {
			System.out.print(s.push(r.pop()));
		}
	}
	}