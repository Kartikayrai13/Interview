package Collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp1>{
	public int compare(Emp1 o1,Emp1 o2) {
//		int s = o1.getName().compareTo(o2.getName());
//		if(s == 0) {
//			if(o1.getAge() < o2.getAge()) {
//				return -1;
//			}else if(o1.getAge() == o2.getAge()) {
//				return 0;
//			}else {
//				return 1;
//			}
//		}
//		return s;
//	}
		int s = o2.getName().compareTo(o1.getName());
		if(s==0) {
			return o2.getAge() - o1.getAge();
		}else {
			return s;
		}
		}
		
}
