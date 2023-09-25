package Collections;

public class EqualsAndHash {
	private String fname;
	private String lname;
	private int age;// hashcode cannot be defined for primitive datatype as Wrapper class is used

	public EqualsAndHash() {

	}

	public EqualsAndHash(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	//public boolean equals(Object e) {
		//if (e == null)
			//return false;
		//if (!(e instanceof EqualsAndHash))
			//return false;

		//EqualsAndHash o = (EqualsAndHash) e;
		//return o.fname.equals(this.fname);

		// return this.fname == e.fname;
	//}

	public int hashcode() {

		String str = age + fname + lname;
		return str.hashCode();
	}

	public String toString() {
		return fname + " " + lname + " " + age;
	}
}
