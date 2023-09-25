package CoreJava;

public class FuntionalIntTest {
	public static void main(String[] args) {
		FuntionalInt f = new FuntionalInt() {
			public int dum(int a,int b) {
				return (a-b);
			}
			};
			System.out.println(f.dum(12,12));
			FuntionalInt.sum(12,12);
			f.multi(1,6);
		}
}