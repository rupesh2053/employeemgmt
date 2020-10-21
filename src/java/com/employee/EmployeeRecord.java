package com.employee;

public class EmployeeRecord {
    String empid;
    String name;
    String email;
    String address;
    float salary;
    int phoneno;
    
    public String getEmpid (){
        return this.empid;
    }
    
    public void setEmpid(String empid){
        this.empid = empid;
    }
    
    public String getName (){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress (){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getEmail (){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public float getSalary (){
        return this.salary;
    }
    
    public void setSalary(float salary){
        this.salary = salary;
    }
    
    public int getPhoneno (){
        return this.phoneno;
    }
    
    public void setPhoneno(int phoneno){
        this.phoneno = phoneno;
    }
    
    public String toString(){
        return "[EmpID: "+empid+",\nName: "+name+" , \nEmail: "+email+", \nAddress: "+address+", \nPhone: "+phoneno+",\n Salary:"+salary+"]";
    }
    
}
