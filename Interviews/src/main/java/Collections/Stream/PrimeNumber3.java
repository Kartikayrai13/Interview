package Collections.Stream;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber3 {
public static void main(StringTest[] args) {
List<Integer> a = Arrays.asList(3,13,12,34,45);
a.stream().filter(e-> isPrime(e)).forEach(y-> System.out.println(y +" " ));
}

public static boolean isPrime(Integer x ) {
	int count = 0;
	if(x==1) {
		return false;
	}
	for(int i=2;i<=x-1;i++) {
		if(x%i==0) {
			count ++;
		}
	}
	return count == 0;
}
}
