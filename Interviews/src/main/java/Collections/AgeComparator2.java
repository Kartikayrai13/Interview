package Collections;

import java.util.Comparator;

public class AgeComparator2 implements Comparator<Emp1>{
	
	public int compare(Emp1 o,Emp1 o1) {
//		if(o.getAge()==o1.getAge()) {
//			return 0;
//		}else if(o.getAge()>o1.getAge()) {
//			return -1;
//		}else {
//			return 1;
//		}
		return o.getAge() - o1.getAge();
	}

	}


