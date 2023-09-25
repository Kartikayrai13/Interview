package IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerRead {
public static void main(String[] args) throws IOException{
	FileReader f= new FileReader("D:/user.txt");
	Scanner s = new Scanner(f);
	while(s.hasNext()) {
		String s1 = s.nextLine();
		System.out.println(s1);
	}
	f.close();
	s.close();
}
}
