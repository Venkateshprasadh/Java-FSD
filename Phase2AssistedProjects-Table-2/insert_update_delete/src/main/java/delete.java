

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete
 */
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw =response.getWriter();
		int del_id=Integer.parseInt(request.getParameter("emp_id"));
		ConnectionDAO dao = new ConnectionDAO();
		try {
			int r = dao.delete(del_id);
			if(r>0)
			{
				pw.println("Deletion successful for ID: "+del_id);
				ResultSet rs=dao.retrieve();
				int flag=-1;
				while(rs.next())
				{
					
						flag=1;
						pw.println("<table>");
						pw.println("<tr>");
						pw.println("<td>EMPLOYEE ID</td>");
						pw.println("<td>EMPLOYEE NAME</td>");
						pw.println("<td>EMPLOYEE SALARY</td>");
						pw.println("<td>EMPLOYEE EMAIL</td>");
						pw.println("<td>OPERATIONS AVAILABLE</td>");
						pw.println("</tr>");
						pw.println("<tr>");
						pw.println("<td>"+rs.getInt(1)+"</td>");
						pw.println("<td>"+rs.getString(2)+"</td>");
						pw.println("<td>"+rs.getDouble(3)+"</td>");
						pw.println("<td>"+rs.getString(4)+"</td>");
						pw.println("<td><form action='edit'><input type='submit' value='edit'></form>");
						pw.println("<td><form action='delete.html'><input type='submit' value='delete'></form></td>");
					    pw.println("</tr>");
						pw.println("</table>");
						response.setContentType("text/html");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
