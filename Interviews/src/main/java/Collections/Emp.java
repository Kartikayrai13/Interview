package Collections;

public class Emp implements Comparable<Emp> {
	private Integer age;
	private String name;
	
	public Emp(Integer age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int compareTo(Emp o) {
//		int s = this.name.compareTo(o.name);//if age has to be used Wrapper classes has to be used
//			if(s == 0) {
//				if(this.age < o.age) {
//					return -1;
//				}else if(this.age == o.age) {
//					return 0;
//				}else {
//					return 1;
//				}
//			}
			//return s;
	//return this.age - o.age;
		//return o.name.compareTo(this.name);
		int s = this.name.compareTo(o.name);
		if(s==0) {
			return this.age - o.age;
		}else {
			return s;
			
		}
	}
	
	public String toString() {
		return age + name;
	}

}
