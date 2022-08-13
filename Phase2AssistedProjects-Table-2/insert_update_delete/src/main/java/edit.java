

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class edit
 */
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
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
		int emp_id=(Integer.parseInt(request.getParameter("emp_id")));
		String emp_name=request.getParameter("emp_name");
		double emp_salary=Double.parseDouble(request.getParameter("emp_salary"));
		String emp_email=request.getParameter("emp_email");
		ConnectionDAO dao = new ConnectionDAO();
		PrintWriter pw=response.getWriter();
		int i;
		dao.valueset(emp_id, emp_salary, emp_name, emp_email);
		try {
			i = dao.update();
			if(i>0)
			{
				pw.println("update success");
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
						
						pw.println("</tr>");
						pw.println("<tr>");
						pw.println("<td>"+rs.getInt(1)+"</td>");
						pw.println("<td>"+rs.getString(2)+"</td>");
						pw.println("<td>"+rs.getDouble(3)+"</td>");
						pw.println("<td>"+rs.getString(4)+"</td>");
						
					    pw.println("</tr>");
						pw.println("</table>");
						response.setContentType("text/html");
				}
			}
			else
			{
				pw.println("update failed");
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
