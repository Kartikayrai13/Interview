package CoreJava;

public class Palindrome {
public static void main(String[] args) {
	int num = 131;
	int r;
	int sum = 0;
	int n = num;
	while(n>0) {
		r= n%10;
		sum = sum *10+r;
		n=n/10;
	}
	if(sum == num) {
		System.out.println("this is palindrome");
	}else {
		System.out.println("not a plaindrome");
	}
}
}
