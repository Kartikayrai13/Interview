package Exception;

public class CatchInFinally {
public static void main(String[] args) {
	try {
	int a = 10/0;
	}finally{
		//catch(ArithmeticException e) {//catch wont work in finally block
			System.out.println("Arithmatic");
	}
}
}

