package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {
public static void main(String[] args)throws IOException {
	FileInputStream in = new FileInputStream("D:/rays.png");
	BufferedInputStream bf= new BufferedInputStream(in);
	
	FileOutputStream out = new FileOutputStream("D:/d.png");
	BufferedOutputStream bo = new BufferedOutputStream(out);
	
	byte[] b = new byte[256];
	int c = bf.read(b);
	while(c>0) {
		out.write(b,0,c);
		c = bf.read(b);
	}
	in.close();
	bf.close();
	out.close();
	bo.close();
	System.out.println("copied");
}
}
