package OOPs;

public class TestParentChild {
public static void main(String[] args) {
	Parent p = new Parent();
	Parent p1 = new Child();
	Child c = new Child();
	Child c1 =(Child) new Parent();//parent cannot be 
	//type-casted to child 
	//System.out.println(p1.age);
	System.out.println(c1.age);
}
}
