package Collections;

import java.util.Comparator;

public class Emp1{
	private Integer age;
	private String name;
	
	public Emp1(Integer age, String name) {
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
public String toString() {
	return age+" "+name;
}
}
