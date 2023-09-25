package Collections;

import java.util.Comparator;



public class AgeComparator implements Comparator<Emp1>{
	public int compare(Emp1 o1, Emp1 o2) {
					return o1.getName().compareTo(o2.getName());
				}

			
				
}