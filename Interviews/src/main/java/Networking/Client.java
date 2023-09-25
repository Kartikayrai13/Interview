package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost", 8888);
		
		PrintWriter p = new PrintWriter(s.getOutputStream(),true);
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		System.out.println("client started");
		//read from keyboard
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String str = stdIn.readLine();
		while(str!=null) {
			p.println(str);
			System.out.println("echo:"+bf.readLine());
			if("Bye".equals(str)) {
				break;
			}
			str = stdIn.readLine();
			
		}
		p.close();
		in.close();
		bf.close();
		s.close();
		
		
		
//		PrintWriter p = new PrintWriter(s.getOutputStream());
//		p.println("is it working");
//		p.flush();
//
//		InputStreamReader in = new InputStreamReader(s.getInputStream());
//		BufferedReader bf = new BufferedReader(in);
//		String str = bf.readLine();
//		System.out.println("server:" + str);

		// DataInputStream in = new DataInputStream(s.getInputStream());

		// DataOutputStream out = new DataOutputStream(s.getOutputStream());
		// out.writeBytes("Hello Client");
		// String greet = in.readLine();
		// System.out.println(greet);

		// s.close();

	}
}
