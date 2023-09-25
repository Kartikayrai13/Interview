package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
public static void main(String[] args) {
	ArrayList<Emp> a  = new ArrayList<Emp>();
	a.add(new Emp(27,"Kartikay"));
	a.add(new Emp(28,"Neeraj"));
	a.add(new Emp(39,"Ann"));
	a.add(new Emp(38,"Ann"));
	Collections.sort(a);
	for(Object o : a) {
		System.out.println(o);
	}
}
}
