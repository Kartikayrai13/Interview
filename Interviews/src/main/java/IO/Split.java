package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Split {
	public static void main(String[] args) throws IOException {

		String inputfile = "D:/merge1.txt";
		int nol = 2;
		int count = 0;

		File f = new File(inputfile);
		Scanner s = new Scanner(f);
		while (s.hasNext()) {
			String sc = s.nextLine();
			count++;
		}
		System.out.println("Lines in the file" + ":" + count);
		int temp = count / nol;
		int rem = count%nol;
		int nof = 0;
		if (temp != 0) {
			nof = temp;
		 if (rem !=0){
			nof ++;
		}
	}else {
		nof = temp;
	}
		System.out.println("number of files generated:-" + " " + nof);

		FileReader file = new FileReader(inputfile);
		BufferedReader b = new BufferedReader(file);
		String strline;
		for (int j = 1; j <= nof; j++) {
			FileWriter f1 = new FileWriter("D:/split/aftersplit"+j+".txt");
			BufferedWriter write = new BufferedWriter(f1);
			for (int i = 1; i <= nol; i++) {
				strline = b.readLine();
				if(strline != null) {
					write.write(strline);
					if (i != nol) {
						write.newLine();

					}
				}
			}
			//f1.close();
			write.close();
			
		}
		b.close();
		System.out.println("completed");
		//file.close();
		
	}
	
}
