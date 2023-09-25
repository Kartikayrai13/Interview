package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryData {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("D:/rays.png");
	FileOutputStream fos = new FileOutputStream("D:/b.png");
	int ch = fis.read();
	while(ch != -1) {
		fos.write(ch);
		ch = fis.read();
		System.out.println(ch);
	}
	
	fis.close();
	fos.close();
	System.out.println("overridden");
}
}
