package OOPs;

public class Const2 extends Const {
	int a;

	// implicit constructor calling by jvm
	public Const2() {
		System.out.println("this is 2nd constructor");

	}
	public Const2(int a ) {
		super(a);
		System.out.println("This is explicit const2");
	}
}
