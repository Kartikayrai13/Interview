package Exception;

public class Test1 {
public static void main(String[] args)throws InsufficientExc {
	Account a = new Account();
	a.setBalance(5000);
	a.totalbalance(4000);
	System.out.println(a.getBalance());
}
}
