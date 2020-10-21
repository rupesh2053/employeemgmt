<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            form{
                background: navy;
                color: white;
                text-align: center;
                width: 50%;
                margin-left: 25%;
                padding: 20px;
                border-radius: 5px;
            }
            h2{
                background: #12124D;
                padding: 7px;
                text-transform: uppercase;
            }
            input{
                border: none;
                height: 35px;
                width: 400px;
                text-align: center;
                border-radius: 30px;
                font-weight: bold;
                font-size: 15px;
            }
            #btn{
                background: green;
                color: white;
                font-size: 22px;
                text-transform: uppercase;
            }
            #btn:hover{
                background: darkgreen;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <form action ="EditServletMain" method = "post">
        <h2>Update Info</h2>
        <input type ="text" name ="Emp_id" placeholder ="Employee ID" value = "${id}"><br/><br/>
        <input type ="text" name ="Emp_name" placeholder ="Employee Name" value = "${name}"><br/><br/>
        <input type ="text" name ="Emp_email" placeholder ="Employee Email" value = "${email}"><br/><br/>
        <input type ="text" name ="Emp_address" placeholder ="Employee Address" value = "${address}"><br/><br/>
        <input type ="text" name ="Emp_phone" placeholder ="Employee Phone" value = "${phone}"><br/><br/>
        <input type ="text" name ="Emp_salary" placeholder ="Employee Salary" value = "${salary}"><br/><br/>
        <input type="submit" value ="Edit" id = "btn">
    </form>
    </body>
</html>
