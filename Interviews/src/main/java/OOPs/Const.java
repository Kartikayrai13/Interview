package OOPs;

 public class Const {
 int age;
 int add;
 //explicit constructor calling via super keyword
 
 public Const() {
	System.out.println("This is default constructor");
}
	
	  public Const(int a) { 
		  super(); 
		System.out.println("this is ist constructor");
	}
	 
	 public Const(int a ,int b) {
		 this.age = a ;
		 this.add = b;
		 System.out.println("Constructor with this keyword");
	 }
	 
 }