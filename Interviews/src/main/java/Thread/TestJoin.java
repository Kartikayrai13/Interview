package Thread;

public class TestJoin extends Thread{
	
	public TestJoin(String name) {
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
			}
			System.out.println("Name:"+getName());
		}
	}
	
	public static void main(String[] args) {
		TestJoin t = new TestJoin("t");
		TestJoin t1 = new TestJoin("t1");
		TestJoin t2 = new TestJoin("t2");
		
		t.start();
		//t1.start();
		try {
		t.join(2000);
		//System.out.println("join started");
	}catch(InterruptedException e ) {
}
		t1.start();
		t2.start();

		
	}
}
