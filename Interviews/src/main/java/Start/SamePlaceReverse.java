package Start;

public class SamePlaceReverse {
	public static void main(String[] args) {
		String str = "Hello world of bad people";
		String[] tstr = str.split(" ");
	
		for(int i=0;i<tstr.length;i++) {
			for(int j=tstr[i].length()-1;j>=0;j--) {
				System.out.print(tstr[i].charAt(j));
				
			}
			System.out.print(" ");
			
		}
	}

}
