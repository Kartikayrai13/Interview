package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.CallableStatement;

public class Procedure {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "root");
		CallableStatement cs = conn.prepareCall("{call new_procedure(?)}");
		cs.setInt(1, 1);
		cs.registerOutParameter(1, Types.VARCHAR);
		// cs.registerOutParameter(3, Types.VARCHAR);
		// cs.registerOutParameter(4, Types.VARCHAR);
		cs.execute();
		// for multiple columns at a time
		// System.out.print(cs.getString(2));
		// System.out.print(cs.getString(3));
		// System.out.println(cs.getString(4));

		System.out.println(cs.getString(1));

		conn.close();

	}
}
