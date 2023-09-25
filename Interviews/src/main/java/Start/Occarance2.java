package Start;

public class Occarance2 {
public static void main(String[] args) {
	String str = "Kartikay Rai";
	String lstr = str.toLowerCase();
	int count = 0;
	
	for(char a = 'a'; a<='z'; a++) {
		for(int i=0; i<=lstr.length()-1; i++) {
			if(a== lstr.charAt(i)) {
			count ++;
			
			}
	}if(count != 0) {
		
	System.out.println(a +"="+count);

	}
	count = 0;
}
}
}



