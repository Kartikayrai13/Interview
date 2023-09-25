package Exception;

public class IllegalArgumentExc {

	int age;
	public void setAge(int age) {
	if(age<0) {
		throw new IllegalArgumentException("Age should be greater than zero");
	}else {
		this.age = age;
	}
}
}
