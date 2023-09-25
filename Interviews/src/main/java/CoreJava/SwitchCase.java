package CoreJava;

public class SwitchCase {
public static void main(String[] args) {
	int t=5;
	String s;
	switch(t) {
	case 0:
		s="Sunday";
		break;
	case 1:
		s="Monday";
		break;
	case 2:
		s="Tuesday";
		break;
	default :
		s="This is default day";
	}
	System.out.println(s);
}
}
