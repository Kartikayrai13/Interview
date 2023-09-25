package IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerRead2 {
public static void main(String[] args) throws IOException{
	FileReader file = new FileReader("D:/user.txt");
	Scanner s = new Scanner(file);
	
	while(s.hasNext()) {
	 String s1 = s.nextLine();
	 System.out.println(s);
	}
}
}
