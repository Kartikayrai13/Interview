package CoreJava;

public class HarmonicSeries {
public static void main(String[] args) {
	 int num = 10;
	 //double r=0.0;
	float r = 0;
	System.out.println("The Harmonic series till number value is:"+ 1/num);
	while (num > 0) {
		r = r +  (float)1 / num;  //float or double is imp without it answer will not come
		num--;
		System.out.println(r +".");

	}
}
}
