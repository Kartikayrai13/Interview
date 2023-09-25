package CoreJava;

public class PrimeNumberTest {
public static void main(String[] args) {
	int t = 13;
	int temp = 0;
	for (int i=2;i<t;i++) {
		if (t%i==0) {
			temp++;
	}
}
if(temp==0) {
	System.out.println("this is a prime number");
}else {
	System.out.println("this is not a prime number");
}
}
}

