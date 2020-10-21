package com.servlet;

import com.employee.EmployeeRecord;
import com.employee.dao.EmployeeDao;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class Employee extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String Empid = request.getParameter("Empid");
        
        EmployeeDao dao = new EmployeeDao();
       EmployeeRecord er = dao.getEmployee(Empid);
        request.setAttribute("Employee",er);
        if(Empid.equals("")){
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request,response);
        }else{
                 RequestDispatcher rd = request.getRequestDispatcher("DisplayEmployee.jsp");
                 rd.forward(request,response);
        }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request,response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request,response);
    }
}
