package Collections.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSalary {
public static void main(StringTest[] args) {
	ArrayList<Employee> a = new  ArrayList<Employee>();
	a.add(new Employee("Kartik",28000));
	a.add(new Employee("Anand",23000));
	a.add(new Employee("Anubhav",27000));
	a.add(new Employee("Ann",21000));
	
	
//a.stream().filter(e -> e.getSalary() > 22000).collect(Collectors.toList()).forEach(e -> System.out.println(e.getName()+" "+e.getSalary()));
double s = a.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
	System.out.println(s);

	//ArrayList b = a.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toCollection(ArrayList::new));
	//System.out.println(b);
	//ArrayList c = a.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toCollection(ArrayList::new));//.forEach(e->System.out.println(e.getName()+" "+e.getName()));
	//System.out.println(c);
	 List b = a.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(b);

}
}
