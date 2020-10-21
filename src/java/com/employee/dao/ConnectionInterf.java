
package com.employee.dao;
import java.sql.*;
import java.util.logging.*;

public class ConnectionInterf {
    static Connection connection = null;
    static Statement statement = null;
    public static Connection getConnection(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");
        }catch(Exception e){
            System.out.println(e);
        }
        return connection;
    }
    public static Statement getStatement(){
        connection = ConnectionInterf.getConnection();
            try {
                statement = connection.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionInterf.class.getName()).log(Level.SEVERE, null, ex);
            }
        return statement;
    }
}
