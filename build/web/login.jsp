<%-- 
    Document   : login
    Created on : Aug 22, 2021, 11:12:33 AM
    Author     : Quang Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <!-- Boostrap CSS -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css"/>
        <title>Sunrise Auto - Login</title>
    </head>
    <body>
        <div class="formm">
               <form action="login" method="post">
            <div class="form-group">
                <label for="exampleInputEmail1">Account</label>
                <input  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="acc">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1" name="pass">
            </div>
            <label style="padding-top: 20px;">${requestScope.meswrong!=null?requestScope.meswrong:""}</label>
            <button style="background-color: white;color: #282828" type="submit" class="btn btn-primary">Login</button>
            <button style="background-color: white;color: #282828" class="btn btn-primary">
                <a style="text-decoration: none;color: #000000" href="register.jsp"/>Creat account</button>
            <button style="background-color: white;color: #282828" class="btn btn-primary">
                <a style="text-decoration: none;color: #000000" href="products"/>Home</button>
        </form> 
        </div>
    
        <style>
            * {
                box-sizing: border-box;
                margin: 0;padding: 0;
            }
            .formm {
                min-height: 100vh;
                display: flex;
                margin: 0;
                background: #000000;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to top, #434343, #000000);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to top, #434343, #000000); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            }
            .btn-primary{
                margin-left: 27px;
            }
            label{
                color: white;
                display: block;
            }
            form{
                display: table;
                margin: 0 auto;
                margin-top: 200px;
                border-radius:10px;
                background-color: #282828;
                padding: 50px;
            }
        </style>
    </body>
</html>
