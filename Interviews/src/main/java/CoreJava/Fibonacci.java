package CoreJava;

public class Fibonacci {
public static void main(String[] args) {

	int f = 0;
	int g = 1;
	System.out.println("Fibonacci series till" + " " +   " " + "numbers:");
	for (int i = 1; i < 10; i++) {
		int c = f + g;
		System.out.print(f + ",");
		
		f = g;
		g = c;

	}
}
}