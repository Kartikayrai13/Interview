package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class LineByLineRead {
public static void main(String[] args) throws Exception{
	FileReader  r = new FileReader("D:/user.txt");
	BufferedReader br = new BufferedReader(r);
	
	 //int ch = br.read();
	 String line =  br.readLine();
	 
	 
	 while(line!=null) {
		 
		 System.out.println(line);
		 line = br.readLine();
	 }
	 r.close();
	 br.close();
}
}