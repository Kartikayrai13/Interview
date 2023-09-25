package Exception;

public class Test2 {
public static void main(String[] args) {
	String s = "abc";
	try {
	s.charAt(2);
	int a = 10/0;
	System.out.println(a);
	
	}catch(ArithmeticException a) {
		System.out.println("Arithmatic");
	}catch(StringIndexOutOfBoundsException s1) {
		System.out.println("Index out of bound");
	}catch(Throwable t) {
		System.out.println("Throwable");
	}finally {
		System.out.println("finally");	
		
	}
}
}
