package IO;

import java.io.File;

public class Directory {
public static void main(String[] args) {
	//File f = new File("D:/user.text");
	File f = new File("D:/adv");
	if(f.exists()) {
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		File f1 = new File(f,"text");
		f1.mkdir();
		System.out.println("Directory created");
	}
}
}
