package Collections;

public class TestEqualsAndHash {
public static void main(String[] args) {
	EqualsAndHash e = new EqualsAndHash("Kartikay","Rai",24);
	EqualsAndHash e1 = new EqualsAndHash("Kartikay","Rai",24);
	
	if(e.equals(e1)) {
		if(e.hashcode() == e1.hashcode()) {
			System.out.println("Both objects are equal");
		}else {
			System.out.println("Are not equal");
		}
	
	}
}
}
