package Collections;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Linked1 {
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	l.add(1);
	l.add(2);
	l.add(3);
	System.out.println(l.size());//defines the current size of the LinkedList
	System.out.println(l.isEmpty());//returns true or false when LinkedList is empty or not
	System.out.println(((LinkedList) l).getFirst());//returns the 1st element 
	System.out.println(l.getLast());
	System.out.println(l);
	l.remove();
	l.remove();
	System.out.println(l);

}
}
