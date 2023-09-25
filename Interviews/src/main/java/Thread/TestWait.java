package Thread;

public class TestWait extends Thread{
	String name;
	public TestWait(String name) {
		super(name);
	}
	@Override
	public synchronized void run() {
		for(int i=1;i<5;i++) {
			System.out.println("Number:-"+getName()+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
			}
		}
	}
	public static void main(String[] args) {
		TestWait w = new TestWait("Ram");
		TestWait w1 = new TestWait("Sita");
		
		w.start();
		w1.start();
		try {
		w.wait();
			//w.sleep(10);
		System.out.println("waiting");
	}catch (Exception e) {
	}
//w1.start();
}
}