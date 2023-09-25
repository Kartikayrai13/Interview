package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmailRead {
public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("D:/user.txt");
		BufferedReader br= new BufferedReader(file);
		
		String line = br.readLine();
		while(line!=null) {
			if(line.endsWith("abc@gmail.com"))
			{
				System.out.println(line);
				
			}
			
			line = br.readLine();
			
			System.out.println("email");
		}
		br.close();
		file.close();
		
	}

}
