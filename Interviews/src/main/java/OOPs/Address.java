package OOPs;

public class Address implements Cloneable{
 String add;

public Address(String a) {
	this.add = a;
}
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}
