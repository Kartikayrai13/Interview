package Collections.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringTest {
public static void main(String[] args) {
	String [] s = {"one","two","three","four"};
	Stream<String> a = Arrays.stream(s);
	a.map(e-> e.toUpperCase()).filter(e-> e.startsWith("T")).distinct().forEach(e->System.out.println(e));
}
}
