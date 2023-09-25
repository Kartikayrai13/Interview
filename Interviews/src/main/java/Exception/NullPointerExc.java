package Exception;

public class NullPointerExc {
	public static void main(String[] args) {
		try {
		String s = null;
		System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println("Length of the string is not defined");
		}finally {
			System.out.println("Finally block attempted");
		}
			
		}
	}


