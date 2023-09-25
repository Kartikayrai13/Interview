package OOPs;

public class Shape {
	private int borderwidth;
	private String color;
	
	public Shape() {}
	
	public void setBorderwidth(int wb){
		this.borderwidth = wb;
		
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setColor(String c) {
		this.color = c;
	}
	public String getColor() {
		return color;
	}
	public double area() {
		return 0;
	}
	
}
