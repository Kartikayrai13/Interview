package Thread;

public class WithRunnable implements Runnable{
	private String name;
	
	public WithRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Name:"+" "+name);
		}
	}
	public static void main(String[] args) {
		//Thread t = new Thread(new WithRunnable("Ram"));
		//Thread t1 = new Thread(new WithRunnable("Sita"));
		
		WithRunnable w = new WithRunnable("Ram");
		WithRunnable w1 = new WithRunnable("Sita");
		
		w.run();
		w.run();
		//t.start();
		//t1.start();
		
		
		
	}

	
}
