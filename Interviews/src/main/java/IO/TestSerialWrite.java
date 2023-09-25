package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialWrite {
public static void main(String[] args) throws IOException{
	FileOutputStream fo = new FileOutputStream("D:/w.ser");
	ObjectOutputStream o= new ObjectOutputStream(fo);
	
	Marksheet m = new Marksheet();
	m.setFname("Kartik");;
	m.setLname("Rai");
	m.setAge(27);
	
	o.writeObject(m);
	fo.close();
	o.close();
	System.out.println("Serializable completed");
	
}
}
