package CoreJava;

@FunctionalInterface
public interface FuntionalInt {

	public int dum(int a ,int b);
	
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	public default void multi(int a,int b) {
		System.out.println(a*b);
	}
}
