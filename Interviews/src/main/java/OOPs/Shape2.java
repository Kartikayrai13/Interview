package OOPs;

public class Shape2 {

	public Shape2() {
		
	}
	public double area() {
		return 0;
	}
	public static Shape2 getShape(String i) {
		if (i=="Rectangle"){
			return new Rectangle1();
	}
		return new Shape2();
			
	}
}
