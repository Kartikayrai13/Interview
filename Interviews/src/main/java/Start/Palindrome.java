package Start;

public class Palindrome {
public static void main(String[] args) {
	String str = "madam";
	String rev = "";
	for (int i=str.length()-1;i>=0;i--) {
		rev = rev + str.charAt(i);
	}
	System.out.println(rev);
	if(str.matches(rev)) {
		System.out.println("this is palindrome" );
	}else {
		System.out.println("this is not a palindrome");
	}
}
}
