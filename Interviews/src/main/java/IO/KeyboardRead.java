package IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardRead {
public static void main(String[] args) throws IOException{
	PrintWriter p = new PrintWriter(new FileWriter ("D:/user.text"));
	
	InputStreamReader read = new InputStreamReader(System.in);
	BufferedReader buffer = new BufferedReader(read);
	
	String s = buffer.readLine();
	while(!s.equals("quit")) {
		p.println(s);
		s = buffer.readLine();
		
		
	}
	p.close();
	read.close();
	buffer.close();
	System.out.println("keyboard");
}
}
