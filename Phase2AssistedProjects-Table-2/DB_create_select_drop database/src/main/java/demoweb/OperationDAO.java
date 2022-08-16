package demoweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OperationDAO 
{
	
	public int create() throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		ResultSet rs=null;
		int rt=0,ok=0;
		if(con!=null) {
			
			System.out.println("connection is established");
			String sql="create database meat";
			ok=st.executeUpdate(sql);			
			String sql1="use meat";
			 rt=st.executeUpdate(sql1);
			return ok;
			}
		else {
			System.out.println("connection failed");
			return ok=0; 
		}
		
	}

	public int delete() throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		int rs=0;
		if(con!=null)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("drop is established");
			String sql="drop database meat";
			rs=st.executeUpdate(sql);
			return rs;
		}
		else
		{
			System.out.println("Sorry! Connection Failed");
			return rs;
		}
		
	}	
	}

