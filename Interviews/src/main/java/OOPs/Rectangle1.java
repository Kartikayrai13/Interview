package OOPs;

public class Rectangle1 extends Shape2{
	private int length;
	private int width;

	public Rectangle1() {
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double area() {
		float a = length * width;
		return a;
	}

}
