package Thread;

public class Amount {
	private double balance;

	public double getBalance() {
		delay();
		return balance;
	}

	public void setBalance(double balance) {
			delay();
		this.balance = balance;
	}

	public synchronized void deposit(String msg, int amt) {
		double bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg +" " +"new Balance:" + bal);
	}

	public void delay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
	}
}