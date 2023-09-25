package Thread;

public class DaemonThreadRun extends Thread {
	@Override
	public void run() {
		System.out.println("Daemon thread started:-" + Thread.currentThread().isDaemon());
		while (true) {
			try {
				Thread.sleep(2000);
				System.out.println("Daemon wakeup again");
			} catch (InterruptedException e) {

			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Main Started");
		DaemonThreadRun d = new DaemonThreadRun();
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e ){
		}
		System.out.println("Leaving main method ");
		System.out.println("Now JVM will exit");
			
		}
	}
