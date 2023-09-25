package Thread;

public class RacingCondition extends Thread {
	
	public RacingCondition(String name) {
		super(name);
		
	}
 public static Amount a = new Amount();
	
	public void run() {
		for(double i=1;i<=5;i++) {
			a.deposit(getName(), 1000);
		}
	}
	public static void main(String[] args) {
		RacingCondition r = new RacingCondition("Ram");
		RacingCondition r1 = new RacingCondition("Sita");
		r.start();
		r1.start();
		
	}
}
