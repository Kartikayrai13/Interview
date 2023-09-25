package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;



public class Function {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","root");
	
	CallableStatement cs = conn.prepareCall("{?=call new_function(?)}");
	
	
		cs.registerOutParameter(1, Types.VARCHAR);
		cs.setInt(2, 3);
		
		
			cs.execute();
		System.out.println(cs.getString(1));
		//System.out.println(cs.getInt(2));
		conn.close();
		
}
}