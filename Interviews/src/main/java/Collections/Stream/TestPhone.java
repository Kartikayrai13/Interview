package Collections.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestPhone {
public static void main(StringTest[] args) {
	ArrayList<Employee1> a = new ArrayList<Employee1>();
	a.add(new Employee1("Kartik","9876542314"));
	a.add(new Employee1("Ananad","87654312876"));
	a.add(new Employee1("Ann","9087653412"));
	a.add(new Employee1("Kartik","9876542414"));
	a.add(new Employee1("Nanad","8765431280"));
	a.add(new Employee1("Pawan","7876543129"));
	
	a.stream().map(e-> e.getPhone()).filter(e-> e.length() == 10).distinct()
	.collect(Collectors.collectingAndThen(Collectors.toList(), 
			e->{Collections.shuffle(e);return e.stream();
		})).limit(3).forEach(e-> System.out.println(e));
	
}
}

