package com.employee.dao;

import com.employee.EmployeeRecord;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDao extends ConnectionInterf {
    static EmployeeRecord er = new EmployeeRecord();
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;
    static String query = "";
    
    
    public EmployeeRecord getEmployee(String empid){
            
            try{
                con = ConnectionInterf.getConnection();
                st = ConnectionInterf.getStatement();
                
                query = "select * from tbl_employee where emp_id = '"+empid+"';";
                rs = st.executeQuery(query);
                if(rs.next()){
                    er.setEmpid(rs.getString("emp_id"));
                    er.setName(rs.getString("emp_name"));
                    er.setEmail(rs.getString("emp_email"));
                    er.setAddress(rs.getString("emp_address"));
                    er.setSalary(rs.getFloat("emp_salary"));
                    er.setPhoneno(rs.getInt("emp_phone"));
                }else{
                    
                }
            }catch(Exception e){
                System.out.println(e);
            }finally{
                try{
                    st.close();
                    rs.close();
                    con.close();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            
        return er;
    }
    
    public int insertEmployee(String id, String name, String address, String email, long phone, double salary){
        con = ConnectionInterf.getConnection();
        st = ConnectionInterf.getStatement();
        int row = 0;
        query = "INSERT INTO tbl_employee(emp_id, emp_name, emp_email, emp_address, emp_phone, emp_salary) VALUES('"+id+"', '"+name+"', '"+email+"', '"+address+"', "+phone+", "+salary+");";
         
        try{
         row = st.executeUpdate(query);
         if(row > 0){
             return 1;
         }else{
             return 0;
         }
        }catch(Exception e){
            System.out.println(e);
        }finally{
                try{
                    st.close();
                    rs.close();
                    con.close();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        return row;
    }
    
    public static ArrayList<EmployeeRecord> getAllEmployees(){
          ArrayList<EmployeeRecord> list=new ArrayList();
            try{
                 con = ConnectionInterf.getConnection();
                 st = ConnectionInterf.getStatement();
                 rs = st.executeQuery("SELECT * FROM tbl_employee");
	while(rs.next()){
                    EmployeeRecord er = new EmployeeRecord();
	er.setEmpid(rs.getString("emp_id"));
                    er.setName(rs.getString("emp_name"));
                    er.setEmail(rs.getString("emp_email"));
                    er.setAddress(rs.getString("emp_address"));
                    er.setSalary(rs.getFloat("emp_salary"));
                    er.setPhoneno(rs.getInt("emp_phone"));
	list.add(er);
        }
    }catch(Exception e){
        System.out.println(e);
    }finally{
                try{
                    st.close();
                    rs.close();
                    con.close();
                }catch(Exception e){
                    System.out.println(e);
                }
            }		
        return list;
    }
    
   public int getDeleteServlet(String id){
        con = ConnectionInterf.getConnection();
        st = ConnectionInterf.getStatement();
        int row = 0;
        query = "DELETE FROM tbl_employee where emp_id = '"+id+"';";
         
        try{
         row = st.executeUpdate(query);
         if(row > 0){
             return 1;
         }else{
             return 0;
         }
        }catch(Exception e){
            System.out.println(e);
        }finally{
                try{
                    st.close();
                    rs.close();
                    con.close();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        return row;
    }
   
    public int getEditServlet(String id,String name, String email, String address, int phone, float salary){
        con = ConnectionInterf.getConnection();
        st = ConnectionInterf.getStatement();
        int row = 0;
        query = "update tbl_employee set emp_id = '"+id+"', emp_name = '"+name+"', emp_address = '"+address+"', emp_email = '"+email+"', emp_salary = "+salary+", emp_phone = "+phone+" where emp_id = '"+id+"';";
         
        try{
         row = st.executeUpdate(query);
         if(row > 0){
             return 1;
         }else{
             return 0;
         }
        }catch(Exception e){
            System.out.println(e);
        }finally{
                try{
                    st.close();
                    rs.close();
                    con.close();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        return row;
    }
}
