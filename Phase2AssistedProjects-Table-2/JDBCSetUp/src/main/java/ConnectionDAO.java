import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionDAO 
{
	public int connect() throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.getCon();
		
		int rs=0;
		if(con!=null) {
			
			System.out.println("connection is established");
			return 1;
			}
		else {
			System.out.println("connection failed");
			return 0;
		}
		
		
		
	}
	
		
	}

