import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionDAO 
{
	
	int emp_id;
	double emp_salary;
	String emp_name;
	String emp_email;
	public void valueset(int emp_id,double emp_salary,String emp_name,String emp_email)
	{
		this.emp_id=emp_id;
		this.emp_salary=emp_salary;
		this.emp_name=emp_name;
		this.emp_email=emp_email;
	}
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
	public int insert() throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		int rs=0;
		if(con!=null) {
			
			System.out.println("connection is established");
			String sql="insert into employee values(?,?,?,?)";
			/*String sql="insert into employee values('"+this.emp_id+"''"+this.emp_name+"'"
					+ "'"+this.emp_salary+"''"+this.emp_email+"'";
			 rs=st.executeQuery(sql);
			 return rs;*/
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, this.emp_id);
			ps.setString(2,this.emp_name );
			ps.setDouble(3, this.emp_salary);
			ps.setString(4,this.emp_email);
			int row=ps.executeUpdate();
			return row;
		}
		else {
			System.out.println("connection failed");
		}
		
		return rs;
		
	}
	
	
	
	
	public ResultSet retrieve() throws SQLException, ClassNotFoundException
	{
		
		///statement Example
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		ResultSet rs=null;
		if(con!=null)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Connection established");
			String sql="select * from employee";
			 rs=st.executeQuery(sql);
			 return rs;
			 }
		else
		{
			System.out.println("Sorry! Connection Failed");
		}
		return rs;
	}
	
	public int delete(int delete_id) throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		int rs=0;
		if(con!=null)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("delete established");
			String sql="delete from employee where emp_id='"+delete_id+"'";
			 rs=st.executeUpdate(sql);
			 return rs;
		}
		else
		{
			System.out.println("Sorry! Connection Failed");
		}
		return rs;
	}
	
	
	public int update() throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.getCon();
		Statement st=con.createStatement();
		int rs=0;
		if(con!=null) {
			
			System.out.println("connection is established");
			System.out.println("update is established");
			
			String sql="update  employee set emp_id=?, emp_name=?,emp_salary=?,emp_email=?"
					+ "where emp_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, this.emp_id);
			ps.setString(2,this.emp_name );
			ps.setDouble(3, this.emp_salary);
			ps.setString(4,this.emp_email);
			ps.setInt(5, this.emp_id);
			int row=ps.executeUpdate();
			return row;
		}
		else {
			System.out.println("connection failed");
		}
		
		return rs;
		
	}
		
	}

