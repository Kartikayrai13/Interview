package CoreJava;

public class FuntionalIntTest2 {
public static void main(String[] args) {
	FuntionalInt f = (a ,b)->{
		return(a-b);
	};
		int a = 34;
		int b= 23;
		System.out.println(f.dum(a, b));
		
}
}
