package CoreJava;

public class BubbleSort {
	public static void main(String[] args) {
		
	int[] a = { 10, 34, 54, 32, 21, 45, 65, 1 };

	int temp;
	for (int i = 0; i < a.length; i++) { 
		for (int j = 1; j < a.length -i; j++) { 
			if (a[j - 1] > a[j]) {
				temp = a[j - 1]; 
				a[j - 1] = a[j];
				a[j] = temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) { 
		System.out.print(a[i] +" ");
	}
}
}