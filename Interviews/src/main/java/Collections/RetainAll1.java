package Collections;

import java.util.ArrayList;

public class RetainAll1 {
public static void main(String[] args) {
	//ArrayList<String> a = null;//new ArrayList<>();
	ArrayList<String> a =new ArrayList<>();
	a.add("1");
	a.add("2");
	a.add("3");
	//a.add(null);
	System.out.println(a);
	ArrayList<String> a1 = new ArrayList<>();
	a1.add("1");
	a1.add("3");
	a1.add("4");
	System.out.println(a1);
	//a1.retainAll(a);
	System.out.println(a);
	System.out.println(a1);
	System.out.println(a.retainAll(a1));
	System.out.println(a);
	System.out.println(a1);
	}
}

