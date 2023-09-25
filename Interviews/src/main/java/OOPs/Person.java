package OOPs;

public class Person implements Cloneable {
 int age;
 Address add;

public Person(int a) {
	age = a;
	add = new Address("cm 2nd");
}
public Object clone() throws CloneNotSupportedException{
	Person p = (Person)super.clone();
	p.add = (Address)add.clone();
	return p;
}
}
