package Exception;

public class InsufficientExc extends Exception{
	public InsufficientExc() {
		super("Balance cannot be less than 2000");
	}

}
