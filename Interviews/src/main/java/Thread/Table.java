package Thread;

public class Table {

	public Table() {
	}
	public synchronized void start(String msg,int a) {
		for(int i=1;i<=10;i++) {
			delay();
			System.out.println("Table of:"+" "+msg+a*i);
		}
	}
public void delay() {
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
}
}
}