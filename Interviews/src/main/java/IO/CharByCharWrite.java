package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CharByCharWrite {
public static void main(String[] args) throws Exception{
	FileWriter f = new FileWriter("D:/user.txt");
	//BufferedWriter b = new BufferedWriter(f);
	
	char[] c = {'w','r'};
	f.write(c);
	f.close();
	System.out.println("CharByChar write");
	
	
}
}
