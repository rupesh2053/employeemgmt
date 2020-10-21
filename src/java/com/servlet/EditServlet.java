package com.servlet;

import com.employee.EmployeeRecord;
import com.employee.dao.EmployeeDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditServlet extends HttpServlet {
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String empid = request.getParameter("id");
            
             EmployeeDao dao = new EmployeeDao();
             EmployeeRecord er = dao.getEmployee(empid);
             
             String name = er.getName();
             String address = er.getAddress();
             String email = er.getEmail();
             int phone = er.getPhoneno();
             float salary = er.getSalary();
             
             HttpSession session = request.getSession();
             session.setAttribute("id", empid);
             session.setAttribute("name", name);
             session.setAttribute("email", email);
             session.setAttribute("address", address);
             session.setAttribute("phone",phone);
             session.setAttribute("salary", salary);
             response.sendRedirect("EditForm.jsp");
             
    }
}