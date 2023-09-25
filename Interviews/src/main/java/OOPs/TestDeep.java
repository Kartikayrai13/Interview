package OOPs;

public class TestDeep {
public static void main(String[] args) throws CloneNotSupportedException{
	
	Person p = new Person(27);
	Person p1 = (Person)p.clone();
	p1.age = 30;
	p.add.add = "cm 2nd 571";
	p1.add.add = "nyay";
	System.out.println(p.age);
	System.out.println(p1.age);
	System.out.println(p.add.add);
}

}
