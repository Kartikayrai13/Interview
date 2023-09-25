package Start;

public class Reverse {
	public static void main(String[] args) {
		String str = "hello world of good people";
		String nstr = "";
		char c;
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			
			nstr = c + nstr;
			
		}
		System.out.println(nstr);
		
	}
}

