package Exception;

public class StringOutOfBoundExc {
public static void main(String[] args) {
	try {
	String s = "Rai";
	s.charAt(3);
}catch(StringIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
}
}
}
