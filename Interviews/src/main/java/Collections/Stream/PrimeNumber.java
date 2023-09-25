package Collections.Stream;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

	public static void main(StringTest[] args) {
		

		//List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

		//list.stream().filter(e -> e % 2 != 0).forEach(System.out::println);

List<Integer> list = Arrays.asList(1,2,3,4,5,8,9,10,21,23,25,26, 29,30, 53);
		
		list.stream().filter(l-> isPrime(l)).forEach(y-> System.out.print(y + " "));
	}

	private static boolean isPrime(Integer x) {
		
		int count = 0;
		
		if(x==1) {
			return false;}
		
		for(int i=2; i<=x-1; i++) {
			if(x%i==0) {
				count++;
			}
		}
		return count==0;
		
	}

	}
	

