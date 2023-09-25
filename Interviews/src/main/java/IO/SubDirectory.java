package IO;

import java.io.File;

public class SubDirectory {
public static void main(String[] args) {
	File f = new File("D:/");
	String [] files = f.list();
	for(String s :files) {
		System.out.println(s);
	}
}
}
