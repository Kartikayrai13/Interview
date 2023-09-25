package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge {
	public static void main(String[] args) throws IOException {
		PrintWriter print = new PrintWriter("D:/merge1.txt");

		BufferedReader br = new BufferedReader(new FileReader("D:/user.text"));
		String s = br.readLine();
		while (s != null) {
			// print.write(s);s
			print.println(s);
			s = br.readLine();
		}
		br.close();
		br = new BufferedReader(new FileReader("D:/user.txt"));
		s = br.readLine();
		while (s != null) {
			// print.write(s);
			print.println(s);
			s = br.readLine();
		}

		print.flush();
		print.close();
		br.close();
		System.out.println("merged");
	}
}
