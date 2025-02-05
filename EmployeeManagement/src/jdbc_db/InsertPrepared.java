package jdbc_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertPrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//step 1 load driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2 create connection object
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement stmt=con.prepareStatement("insert into employees values(?,?,?,?)");
			stmt.setString(1, "rohini");
			stmt.setInt(2, 6);
			stmt.setInt(3, 90000);
			stmt.setInt(4, 5);
			int i=stmt.executeUpdate();
			System.out.println(i+"records inserted");
			con.close();
			 } 
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
