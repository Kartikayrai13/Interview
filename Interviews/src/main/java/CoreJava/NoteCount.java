package CoreJava;

public class NoteCount {
public static void main(String[] args) {
	int num = 4550;
	int[] t = {2000,500,200,100,50,20,10,5,2,1};
	int m ;
	for(int i=0;i<t.length;i++) {
		m=num/t[i];
		if(m>0) {
			System.out.println(t[i]+"="+m);
			num=num%t[i];
		}
	}
}
}