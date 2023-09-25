package CoreJava;

public class SecongLargestNumber {
public static void main(String[] args) {
	int[] t = {1,5,7,2,9,5};
	int temp=0;
	int c = 0;
	for(int i=0; i<t.length;i++) {
		if(temp<t[i]) {
			c=temp;
			temp=t[i];
		}
		if(c<t[i]&& temp>t[i]) {
			c=t[i];
		}
	}
	System.out.println(c);
}
}
