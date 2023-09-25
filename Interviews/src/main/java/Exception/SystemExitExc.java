package Exception;

public class SystemExitExc {

	public static void main(String[] args) {
		try {
		int i= 0;
		int j= 10/0;
		//System.out.println(j);
		
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		System.out.println("Exception Handled");
		System.exit(0);
	}finally {
		System.out.println("Finally");
	}
}

}