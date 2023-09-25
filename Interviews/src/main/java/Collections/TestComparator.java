package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
public static void main(String[] args) {

	ArrayList<Emp1> a  = new ArrayList<Emp1>();
	a.add(new Emp1(32,"Kartikay"));
	a.add(new Emp1(28,"Kartikay"));
	a.add(new Emp1(12,"Basant"));
	a.add(new Emp1(12,"Anubhav"));
	
	//AgeComparator ac = new AgeComparator();
	//AgeComparator2 ac2 = new AgeComparator2();
	//Collections.sort(a,ac);
	//Collections.sort(a,ac2);//in decending order for number and acending for String
	NameComparator na = new NameComparator();
	Collections.sort(a,na);
	
	for(Object o : a ) {
	System.out.println(o);
	
	//	String s = "NameComparator";//name
//	if(s.equals("NameComparator")) {
//		Collections.sort(a,new AgeComparator());
//	}else {
//		Collections.sort(a,new AgeComparator2());
//	}
//	for(Object o : a ) {
//		System.out.println(o);
//	
	
}
}
}