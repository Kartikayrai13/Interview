package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharByCharRead {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("D:/user.txt");
	int ch = fr.read();
	while (ch != -1) {
		char c =(char) ch;
		System.out.println(c);
		ch = fr.read();
	}
	fr.close();
	
}
}
