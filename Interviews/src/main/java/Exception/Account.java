package Exception;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double b) {
		this.balance = b;
	}
	
//	public double getAmount(double d) {
//		balance += d;
//		return balance;	
//	}
	public double totalbalance(double t) throws InsufficientExc{
	
		balance -= t;
		if(balance <2000) {
		InsufficientExc e = new InsufficientExc();
		throw e;
}
	return balance;
}
}