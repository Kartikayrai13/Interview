package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadAndWrite {
public static void main(String[] args) throws IOException{
	
	FileInputStream input = new FileInputStream("D:/rays.png");
	FileOutputStream out = new FileOutputStream("D:/r.png");
	
	int i = input.read();
	while(i!= -1) {
		out.write(i);
		i= input.read();
	}
	input.close();
	out.close();
	System.out.println("overridden");
	
}
}
