package Collections.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
public static void main(String[] args) {
	String [] s = {"ram","shyam","sita","geeta"};
	
	Stream<String> s1 = Arrays.stream(s);
		s1.forEach(System.out::println);
	
		
	}
	
}

