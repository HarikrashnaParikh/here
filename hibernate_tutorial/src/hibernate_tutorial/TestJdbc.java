package hibernate_tutorial;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	public static void main(String args[])
	{
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "Hari@0711";
		
		try {
			System.out.println("Connecting to database: " + jdbcurl);
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection myConn = DriverManager.getConnection(jdbcurl, user, pass);
			System.out.println("Connection successful!");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
