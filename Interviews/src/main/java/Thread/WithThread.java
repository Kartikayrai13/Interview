package Thread;

public class WithThread extends Thread{

	private String name;
	public WithThread(String name) {
		this.name = name;
	}
		public void run() {
			for(int i= 0;i<=5;i++) {
				System.out.println("Name:-"+" "+name);
			}
		}
		public static void main(String[] args) {
			WithThread w = new WithThread("Kartik");
			WithThread w1 = new WithThread("Mohit");
			
			w.start();
			w1.start();
			
			System.out.println(w1.getPriority());
			System.out.println(w.getPriority());
			
		}
	}
