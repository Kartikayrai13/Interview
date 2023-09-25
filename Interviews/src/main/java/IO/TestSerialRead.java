package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestSerialRead {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	FileInputStream fi = new FileInputStream("D:/w.ser");
	ObjectInputStream o = new ObjectInputStream(fi);
	
	
	Marksheet m = (Marksheet) o.readObject();
	System.out.println("Name:-"+m.getFname());
	System.out.println("Surname:-"+m.getLname());
	System.out.println("Age:-"+m.getAge());
	
	fi.close();
	o.close();
	System.out.println("Deserialization Read");
}
}
