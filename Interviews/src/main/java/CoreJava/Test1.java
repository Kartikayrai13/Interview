package CoreJava;

public class Test1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int x = i; x > 0; x--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int y = 3; y > 0; y--) {
			for (int k = 3 - y; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int z = y; z > 0; z--) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}