package Collections.Stream;

public class Employee1 {
private String name;
private String phone;

public Employee1() {
}
public Employee1(String name,String phone) {
	this.name = name;
	this.phone = phone;
}
public String getName() {
	return name;
}
public String getPhone() {
	return phone;
}
public String toString() {
	return name+" "+phone;
}
}
