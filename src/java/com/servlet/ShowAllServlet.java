package com.servlet;

import com.employee.EmployeeRecord;
import com.employee.dao.EmployeeDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowAllServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
	out.println("<h1>Employees List</h1>");
                
	EmployeeDao dao = new EmployeeDao();
	List<EmployeeRecord> list = dao.getAllEmployees();
		
	out.print("<table border='1' width='100%'");
	out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>Salary</th><th>Phone No.</th><th>Edit</th><th>Delete</th></tr>");
	for(EmployeeRecord e :list){
                        out.print("<tr><td>"+ e.getEmpid()+"</td><td>"+e.getName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getAddress()+"</td><td>"+e.getSalary()+"</td><td>"+e.getPhoneno()+"</td><td><a href='EditServlet?id="+e.getEmpid()+"'>edit</a></td><td><a href='DeleteServlet?id="+e.getEmpid()+"'>delete</a></td></tr>");
	}
	out.print("</table>");
		
          out.close();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request,response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request,response);
    }
}
