package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExtRead {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fo = new FileInputStream("D:/ext.ext");
		ObjectInputStream o = new  ObjectInputStream(fo);
		 Employee e = (Employee)o.readObject();
		 System.out.println(e.getName());
		 System.out.println(e.getAge());
		 fo.close();
		 o.close();
		 System.out.println("Deserialization Read");
	}

}
