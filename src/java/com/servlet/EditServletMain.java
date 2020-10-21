package com.servlet;

import com.employee.dao.EmployeeDao;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class EditServletMain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String id = request.getParameter("Emp_id");
        String name = request.getParameter("Emp_name");
        String email = request.getParameter("Emp_email");
        String address = request.getParameter("Emp_address");
        int phone = Integer.parseInt(request.getParameter("Emp_phone"));
        float salary = Float.parseFloat(request.getParameter("Emp_salary"));
        PrintWriter pw = response.getWriter();
        EmployeeDao dao = new EmployeeDao();
        int row = dao.getEditServlet(id, name, email, address, phone, salary);
        if(row >= 1)
            pw.println("Data update successfully.");
        else
            pw.println("Some error happen");
        
        pw.flush();
        pw.close();
    }
}
