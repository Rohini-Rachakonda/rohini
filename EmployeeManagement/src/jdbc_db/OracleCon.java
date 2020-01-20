package jdbc_db;
import java.sql.*;
public class OracleCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//step 1 load driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2 create connection object
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			//step 3 create the statement obj
			Statement stmt=con.createStatement();
			//step 4 execute query
			ResultSet rs=stmt.executeQuery("select * from employees");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			//step 5 close connection
			con.close();
			
		   }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
