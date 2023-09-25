package Collections;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1 {
public static void main(String[] args) {
	String [] a = {"one","two","three","four"};
	Stream<String> s = Arrays.stream(a);
	s.map(e-> e.toUpperCase()).filter(e -> e.startsWith("T"))
	.distinct().forEach(e -> System.out.println(e));
}
}
