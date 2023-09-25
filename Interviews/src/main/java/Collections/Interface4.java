package Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collector;

import javax.swing.plaf.synth.SynthStyle;

public class Interface4 {
	public static void main(String[] args) {
		Queue q = new PriorityQueue();// no null no order duplicate allowed class cast exception
		q.add(4);
		q.add(2);
		q.add(3);
		q.add(4);

		// q.add(null);
		// q.add("add");
		// q.offer("acd");//class cast exception

		System.out.println(q);
		// System.out.println(q.add(5));//returns boolean
		// System.out.println(q.size());//returns size of collection
		// System.out.println(q.isEmpty());//returns boolean
		// System.out.println(q.contains(0));//returns false if element not present
		// System.out.println(q.remove());//return 1 if element removed successfully
		// System.out.println(q.peek());
		// System.out.println(q.poll());
		// System.out.println(q.element());
		// System.out.println(q);

		Deque d = new ArrayDeque();// incersion order duplicate allowed string allowed in int
		d.add(4);// no null
		d.add(2);
		d.add(3);
		d.add(4);
		d.add("acd");
		// d.add(null);
		d.addFirst(6);
		d.addLast(8);
		System.out.println(d);

		Deque d1 = new LinkedList();// Deque

//d1.push("as");
		d1.offer(1);
		d1.offer(5);
		d1.offer(1);
		d1.offer("add");
		d1.offer(null);
		d1.add(12);
		d1.addFirst(34);
		d1.push(12);
		d1.push(null);
		d1.pop();

//d1.addFirst(2);
//d1.addLast(4);
		System.out.println(d1);

		Queue q2 = new LinkedList();
		q2.offer(1);
		q2.offer(6);
		q2.offer(1);
		q2.offer(null);
		q2.offer("acv");
		

		
	}
}
