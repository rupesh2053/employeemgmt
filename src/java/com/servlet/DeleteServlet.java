package com.servlet;

import com.employee.dao.EmployeeDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String empid = request.getParameter("id");
            PrintWriter pw = response.getWriter();
            pw.println(empid);
            
            EmployeeDao dao = new EmployeeDao();
            int row = dao.getDeleteServlet(empid);
            
            if(row >= 1){
              pw.println("Data dateletd successfully.");
           }else{
              pw.println("Some error happen.");
           }
            
            try{
                Thread.sleep(2000);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }catch(Exception e){
                System.out.println(e);
            }
            
            pw.flush();
            pw.close();
    }
}
