package Exception;

public class ArithmaticExc {
public static void main(String[] args) {
	try {
	int i=0;
	int j=15;
	int h = j/i;
	System.out.println(h);
	}
	catch (ArithmeticException e) {
		System.out.println("This number cannot be divided by zero");


}
}}