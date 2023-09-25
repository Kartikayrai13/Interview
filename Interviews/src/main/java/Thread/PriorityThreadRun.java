package Thread;

public class PriorityThreadRun extends Thread {
	private String name;

	public PriorityThreadRun(String name) {
		this.name = name;
	}

	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Name"+" "+name);
		}
	}
	public static void main(String[] args) {
		PriorityThreadRun p = new  PriorityThreadRun("Ram");
		PriorityThreadRun p1 = new PriorityThreadRun("Sita");
	
		p.setPriority(8);
		p1.setPriority(4);
		
		p.start();
		p1.start();
	}
	
	

}
