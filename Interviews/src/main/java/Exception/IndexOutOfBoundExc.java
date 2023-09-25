package Exception;

public class IndexOutOfBoundExc {
public static void main(String[] args) {
	try {
	int [] i= {12,23};
	System.out.println(i[2]);
}catch(IndexOutOfBoundsException e) {
	System.out.println("Index Out of bound");
}finally {
	System.out.println("Finally attempted");
}
}
}
