package Thread;



public class GroupThread extends Thread {
	public GroupThread(ThreadGroup tg, String name) {
		super(tg,name);
	}
	public void run() {
		for(int i=1;i<3;i++) {
			System.out.println("Msg:"+" "+getName()+ i);
		}
	}
	public static void main(String[] args) {
		ThreadGroup t = new ThreadGroup("Team India");
		ThreadGroup t2 = new ThreadGroup("Madhya Pradesh");
		GroupThread g = new GroupThread(t, "jay");
		GroupThread g1 = new GroupThread(t, "vijay");
		GroupThread g2 = new GroupThread(t2 ,"Ajay");
		g.start();
		g1.start();
		//System.out.println("Threadgrouop 1:"+t.getName());
		//System.out.println("Thread group1 parent:"+t.getParent());
		//System.out.println(g.getThreadGroup());
		//System.out.println("threadgroup2 "+t2.getName());
		//System.out.println(""+t2.getParent());
		//System.out.println(t.activeCount());
		//sSystem.out.println(t.activeGroupCount());
	}

}
