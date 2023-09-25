package CoreJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=4-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int x=i;x>0;x--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		int [] t = {990,253,45,67};
		Arrays.sort(t);
		for(int i=0;i<t.length;i++) {
			
		System.out.print(t[i]+" ");
		
	}
}
}