package Maven_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class JDBC_Connection {
	
	
	public static void main(String args[]) throws Exception  {  

		Connection con=null;
		try{  

			//Class.forName("com.mysql.jdbc.Driver");  
						
						Driver d =new Driver(); 
						DriverManager.registerDriver(d);
						
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");

			
			Statement s=con.createStatement();  
			
			//int value=s.executeUpdate("update sys_config set set_by='RAVALI' where value='OFF'");
			int value=s.executeUpdate("insert into sys_config values('company','data','2022-04-24 07:25:14','yes')");
			
			ResultSet rs=s.executeQuery("select * from sys_config");  
			while(rs.next())  {

				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
			}

		}

		catch(SQLException ex)
		{ 
			System.out.println(ex);
		}
		con.close();  
	}  
}



