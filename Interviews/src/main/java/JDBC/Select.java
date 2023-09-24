package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","root");

	PreparedStatement ps = conn.prepareStatement("Select first_name,age from student");
	//ResultSet rs = ps.executeQuery();
	Statement s = conn.createStatement();
	ResultSet rs = s.executeQuery("Select first_name,age from student");
	
		
	while(rs.next()) {
		System.out.print(rs.getString("first_name")+" ");
		System.out.println(rs.getString("age"));
	}
}
}
