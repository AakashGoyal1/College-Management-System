package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
 public static Connection getConnection() throws ClassNotFoundException, SQLException {
	 Connection conn=null;
	try {
//		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aakash","goyal");
	 conn.setAutoCommit(true);
	 System.out.println("connection okkk");
	 return conn;
 }
	 catch(Exception e) {
	    System.out.println("not connected");
		System.out.println(e);
		return conn;
	} 
}
}
