package OOPs;

public class PersonC implements Cloneable{
	public int age = 0;

	public PersonC(int a) {
		this.age = a;
	}
public Object clone()throws CloneNotSupportedException {
	return super.clone();
}
}
