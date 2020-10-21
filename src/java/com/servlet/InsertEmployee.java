package com.servlet;

import com.employee.EmployeeRecord;
import com.employee.dao.EmployeeDao;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class InsertEmployee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException{
        String id = request.getParameter("Emp_id");
        String name = request.getParameter("Emp_name");
        String email =  request.getParameter("Emp_email");
        String address =  request.getParameter("Emp_address");
        int phone = Integer.parseInt(request.getParameter("Emp_phone"));
        float salary = Float.parseFloat(request.getParameter("Emp_salary"));
        PrintWriter pw = response.getWriter();
        
            EmployeeRecord er = new EmployeeRecord(); 
            if(id.equals("") && name.equals("") && address.equals("") && email.equals("")){
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request,response);
            }else{
            er.setEmpid(id);
            er.setName(name);
            er.setEmail(email);
            er.setAddress(address);
            er.setPhoneno(phone);
            er.setSalary(salary);
            }
            
           id = er.getEmpid();
           name = er.getName();
           address = er.getAddress();
           email = er.getEmail();
           phone = er.getPhoneno();
           salary = er.getSalary();
            
            EmployeeDao dao = new EmployeeDao();
           int row = dao.insertEmployee(id, name, address, email, phone, salary);
          
           if(row >= 1){
              pw.println("Data inserted to table Employee successfully.");
           }else{
              pw.println("Some error happen.");
           }
            pw.flush();
            pw.close();
    }
}
