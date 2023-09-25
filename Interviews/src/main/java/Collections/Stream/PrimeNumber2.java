package Collections.Stream;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber2 {
public static void main(StringTest[] args) {
	
List<Integer> s =	Arrays.asList(3,12,34,12,56,13);
s.stream().filter(e-> isPrime(e)).forEach(y-> System.out.println(y+" "));
	}
public static boolean isPrime(int x ) {
	int count = 0;
	if(x==1) {
		return false;
	}
	for(int i=2;i<=x-1;i++) {
		if(x%i == 0) {
			count ++;
		}
	}
	return count == 0;
	}
}

