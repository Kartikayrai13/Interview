package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(8888);
		System.out.println("Server Started");
		Socket s = null;
		//System.out.println("client Connected");
		while(true) {
			s = ss.accept();
			talk(s);
		}
	}
		static void talk(Socket s)throws IOException{
		
			PrintWriter p = new PrintWriter(s.getOutputStream(),true);
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader bf = new BufferedReader(in);
			//read from system
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			String str = stdIn.readLine();
			while(str!=null){
				System.out.println("Server received:"+str);
				
				p.println(str+".."+str);
				if(str.equals("bye")) {
					break;
				}
				str = bf.readLine();
			}
			p.close();
			in.close();
			s.close();
			
			
		}
		
		
		
		
		
		
		
		
		
		
//		InputStreamReader in = new InputStreamReader(s.getInputStream());
//		BufferedReader bf = new BufferedReader(in);
//		String str = bf.readLine();
//		System.out.println("client:" + str);
//
//		PrintWriter p = new PrintWriter(s.getOutputStream());
//		p.println("yes");
//		p.flush();
//
//		// DataInputStream in = new DataInputStream(s.getInputStream());
//
//		// DataOutputStream out = new DataOutputStream(s.getOutputStream());
//		// String greet = in.readLine();
//		// System.out.println(greet);
//		// out.writeBytes("Hello Client");
//		// s.close();
//		// ss.close();

	}

	
