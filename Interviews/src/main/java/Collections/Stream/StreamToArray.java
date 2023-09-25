package Collections.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamToArray {
public static void main(StringTest[] args) {
	Stream s = Stream.of(1,4,2,5,8);
	//s.forEach(System.out::println);
	Object [] s1 = s.toArray();
	System.out.println(Arrays.toString(s1));
	
	}
}


