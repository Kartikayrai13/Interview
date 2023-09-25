package OOPs;

public class Triangle1 extends Shape1{
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public Triangle1(){
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double area(){
		float t=(base*height)/2;
		return t;
	}
}
