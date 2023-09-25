package Start;

public class Testing {
public static void main(String[] args) {
	String s = "Kamal singh";
	System.err.println(s.lastIndexOf("a"));
	System.out.println(s.concat("prem"));
	String b = s.replace('a', 'r');
	String c = s.replaceAll("K", "D");
	//System.out.println(s.replaceAll("a(.*)", "a"));
	//System.out.println(s.replaceAll("si(.*)",""));
	
	StringBuffer sf = new StringBuffer("Kamala");
	//System.out.println(sf.delete(1, 4));
	
}
}
