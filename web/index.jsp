<head>
    <style>
        *{
            text-align: center;
            background: #fff;
        }
        form{
            background: green;
            padding: 20px;
            width: 50%;
            margin-left: 25%;
        }
        #form1 input{
            border: none;
            border-radius: 30px;
            height: 35px;
            width: 200px;
        }
        #btnSearch{
            background: red;
            color: white;
            font-weight: bold;
            letter-spacing: 1px;
            font-size: 20px;
        }
        #btnSearch:hover{
            background: darkred;
            cursor: pointer;
        }
        
        #form2 input{
            border: none;
            border-radius: 30px;
            height: 35px;
            width: 400px;
            font-size: 15px;
        }
        #form1 h2, #form2 h2, #form3 h2{
            background: greenyellow;
            color: white;
            padding: 7px;
            text-transform: uppercase;
            letter-spacing: 1px;
            margin-top: 0px;
        }
        #form2 #btn{
            background: blue;
            color: white;
            font-size: 22px;
            font-weight: bold;
            letter-spacing: 1px;
            margin-top: -10px;
        }
        #form2 #btn:hover{
            background: #12124D;
            cursor: pointer;
        }
        #form3 #searchAll {
            border: none;
            background: blue;
            color: white;
            font-size: 22px;
            font-weight: bold;
            letter-spacing: 1px;
            padding: 7px;
            width: 200px;
            border-radius: 30px;
        }
        
    </style>
</head>
<body>
    <form action ="Employee" method = "post" id = "form1">
        <h2>Search Employee</h2>
        <input type ="text" name ="Empid" placeholder ="Employee ID">
        <input type="submit" value ="Search" id = "btnSearch">
    </form><br/><br/>
    
    
    <form action ="ShowAllServlet" method = "post" id = "form3">
        <h2>Employee Records</h2>
        <input type="submit" value ="Search All" id = "searchAll"><br/><hr>
    </form><br/><br/>
    
    
    <form action ="InsertEmployee" method = "post" id = "form2">
        <h2>Register Employee</h2>
        <input type ="text" name ="Emp_id" placeholder ="Employee ID"><br/><br/>
        <input type ="text" name ="Emp_name" placeholder ="Employee Name"><br/><br/>
        <input type ="text" name ="Emp_email" placeholder ="Employee Email"><br/><br/>
        <input type ="text" name ="Emp_address" placeholder ="Employee Address"><br/><br/>
        <input type ="text" name ="Emp_phone" placeholder ="Employee Phone"><br/><br/>
        <input type ="text" name ="Emp_salary" placeholder ="Employee Salary"><br/><br/>
        
        <input type="submit" value ="Save" id = "btn">
    </form>
</body>
