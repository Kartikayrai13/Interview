package CoreJava;

public class Pyramid {
public static void main(String[] args) {
	for (int i = 1; i <= 4; i++) {
		for (int j = 4 - i; j > 0; j--) { 
			System.out.print(" ");
		}
		for (int k = i; k > 0; k--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	for (int x = 3; x >= 0; x--) {
		for (int y = 3 - x; y >= 0; y--) {
			System.out.print(" "); 
		}
		for (int z = x; z > 0; z--) {
			System.out.print(x + " ");
		}
		System.out.println(); 
	}
}
}