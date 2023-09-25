package Collections;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<Emp>();
		a.add(new Emp(20, "Basant"));
		a.add(new Emp(26, "Kartikay"));
		a.add(new Emp(18, "Ann"));

		a.stream().filter(e-> e.getAge()>18).distinct().collect(Collectors.toList()).forEach(e->System.out.println(e));
	
	}
}