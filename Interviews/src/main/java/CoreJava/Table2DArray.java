package CoreJava;

public class Table2DArray {
public static void main(String[] args) {
	int [][] t = new int [10][10];
	int count = 0;
	for(int i = 0; i< t.length;i++) {
		for(int j=2; j<t[i].length;j++) {
			count = (i+1)*j;
			System.out.print(count + "\t");
			
		}
		System.out.println();
	}
}
}
