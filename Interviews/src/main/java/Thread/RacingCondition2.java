package Thread;

public class RacingCondition2 extends Thread{
	public RacingCondition2(String s) {
		super(s);
	}
	public static Table t = new Table();
	public void run() {
		//for(int i=1;i<=10;i++) {
			t.start(getName(), 12);
		}
	//}
	public static void main(String [] args) {
		RacingCondition2 r = new RacingCondition2("Ram");
		RacingCondition2 r1 = new RacingCondition2("Sita");
		r.start();
		r1.start();
		
	}

}
