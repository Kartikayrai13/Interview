package Exception;

public class TryInCatch {
public static void main(String[] args) {
	try {
		System.out.println("First try attempted");
		
		double d = 15 / 0;
		System.out.println(d);
	} catch (ArithmeticException e) {//parent exception can also be used exception e
		System.out.println("Number  cannot divide by zero-1");
		System.out.println("Catch attempted");
		try {
			double f=15/0;
			System.out.println(f);
			//String s=null;
			//System.out.println(s.length());

		} catch (ArithmeticException n) {
			System.out.println("Number cannot be divided by zero-2");
		
		}catch (NullPointerException n){
			System.out.println("Length cannot be determined");
		}

	} finally{
		System.out.println("finally attempted");
		try {
			double a = 15 / 0;
			System.out.println(a);
		} catch (ArithmeticException f) {
			System.out.println("Number cannot be divided by zero-3");

		}
	}
}

}

