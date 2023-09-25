package OOPs;

public class TestShallow {
public static void main(String[] args)throws CloneNotSupportedException {
	PersonC p = new PersonC(27);
	PersonC p1 = (PersonC)p.clone();
	
	p1.age = 30;
	p1.age = 35;
	
	System.out.println(p.age);
	System.out.println(p1.age);
	
}
}
