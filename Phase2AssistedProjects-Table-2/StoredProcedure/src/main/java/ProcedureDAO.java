import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;





public class ProcedureDAO 
{
	int p_id;
	void setid( int p_id)
	{
		this.p_id=p_id;
	}
	public ResultSet create() throws ClassNotFoundException, SQLException
	{
		Connection con=DbUtil.getCon();
		ResultSet rs=null;
		int rt=0;
		if(con!=null) {
			System.out.println("connection is established");
			
			String sql="{CALL demoo_procedure(?)}";
			CallableStatement smt = con.prepareCall(sql);
			smt.setInt(1, p_id);
			rs = smt.executeQuery();
			
			return rs;
			}
		else {
			System.out.println("connection failed");
			return rs; 
		}
		
	}
}
