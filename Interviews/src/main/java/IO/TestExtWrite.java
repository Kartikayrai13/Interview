package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExtWrite {
	public static void main(String[] args) throws IOException{
		FileOutputStream fw = new FileOutputStream("D:/ext.ext");
		ObjectOutputStream o = new ObjectOutputStream(fw);
		
		Employee e = new Employee();
		e.setName("Kartik");
		e.setAge(27);
		o.writeObject(e);
		fw.close();
		o.close();
		System.out.println("Externalization written");
		
	}

}
