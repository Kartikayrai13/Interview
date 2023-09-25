package OOPs;

public class Circle1 extends Shape1{
	private int radius;
	public final float pi=3.14f;
	
	public Circle1(){
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area(){
		double c=pi*radius*radius;
		return c;
	}

}
