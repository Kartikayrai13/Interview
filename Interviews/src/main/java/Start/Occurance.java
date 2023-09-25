package Start;

public class Occurance {
	public static void main(String[] args) {
		String str = "Hello world of good poeople";
		char c = 'o';
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == c) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
