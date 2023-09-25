package OOPs;

public class TestShapeArray {
public static void main(String[] args) {
	Shape1[] s = new Shape1[3];
	s[0] = new Rectangle1();
	s[1] = new Triangle1();
	s[2] = new Circle1();
	
		
		  Rectangle1 r = (Rectangle1) s[0]; 
		  r.setLength(12); 
		  r.setWidth(10);
		  
		  Triangle1 t = (Triangle1) s[1]; 
		  t.setBase(10); 
		  t.setHeight(12);
		 
	
	Circle1 c = (Circle1) s[2];
	c.setRadius(4);

	double totalArea = area(s);
	System.out.println(totalArea) ;
}	
	public static double area(Shape1[] s) {
		double totalArea = 0;
		for(int i= 0;i<s.length;i++) {
			totalArea += s[i].area();
		}
		return totalArea;
		
	
}
}



