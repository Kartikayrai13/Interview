package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LineByLine {
public static void main(String[] args) throws Exception{
	FileWriter f = new FileWriter("D:/user.txt");
	BufferedWriter b = new BufferedWriter(f);
	//char [] c = {'a','b','d'};
	//f.write(c);
	f.write("string entered");
	f.write("testing for io");
	//f.write(12345);
	f.close();
	System.out.println("Entered into system");
	
}
}
