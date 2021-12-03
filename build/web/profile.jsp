<%-- 
    Document   : profile
    Created on : Aug 22, 2021, 09:13:17 PM
    Author     : Quang Nhat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charse
              t=UTF-8"/>
        <!-- Boostrap CSS -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css"/>
        <!-- Font awesom CSS -->
        <link rel="stylesheet" type="text/css" href="assets/css/all.min.css"/>
        <!-- Header CSS -->
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css"/>
        <script src="js/pagger.js" type="text/javascript"></script>
        <title>Sunrise Auto - Profile</title>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-light fixed-top">
                <div class="container">
                    <a class="navbar-brand logo" href="products">
                        Sunrise Auto</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
                        <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                            <li class="nav-item ">
                                <a class="nav-link" href="products">Trang Chủ</a>
                            </li>
                            <li class="nav-item ">
                                <a class="nav-link" href="products#portfolio">Sản Phẩm</a>
                            </li>
                            <li class="nav-item ">
                                <a class="nav-link" href="products">Liên lạc</a>
                            </li>
                            <li class="nav-item ">
                                <!--gio hang-->
                                <c:choose>
                                    <c:when test="${sessionScope.cart eq null}">
                                        <a href="cart.jsp" class="fas fa-shopping-cart" style="font-size: 20px;text-decoration: none;color: white;margin-top: 10px;"></a>
                                    </c:when>    
                                    <c:otherwise>
                                        <div>
                                            <a href="cart.jsp" class="fas fa-shopping-cart" style="font-size: 20px;text-decoration: none;color: white;margin-top: 10px">
                                                <span style="border: 1px solid white;border-radius: 10px;padding:0 8px 0 8px;font-size: 14px;position: absolute;margin: -7px 0px 0px -7px; ">
                                                    ${sessionScope.cart.size()}</span></a>
                                        </div>
                                    </c:otherwise>
                                </c:choose>
                            </li>
                            <!--Taikhoan-->
                            <c:choose>
                                <c:when test="${sessionScope.account eq null}">
                                    <li class="nav-item ">
                                        <a class="nav-link" href="login.jsp">Đăng nhập</a>
                                    </li>
                                </c:when>  

                                <c:when test="${sessionScope.account.account == 'admin'}">
                                    <li class="nav-item ">
                                        <a class="nav-link" href="logout">Đăng xuất</a>
                                    </li>
                                    <a style="color: #202326;background-color: white;text-align: center;border-radius: 15px" 
                                       class="nav-link" href="crudservlet">Chào admin</a>
                                </c:when>  

                                <c:otherwise>

                                    <li class="nav-item ">
                                        <a class="nav-link" href="logout">Đăng xuất</a>
                                    </li>
                                    <a style="color: #202326;background-color: white;text-align: center;border-radius: 15px;width: 100px;
                                       " class="nav-link" >Chào ${sessionScope.account.account}</a>
                                </c:otherwise>
                            </c:choose>

                        </ul>
                    </div>
                </div> <!-- het container -->
            </nav> <!-- hết nav -->
        </header>

        <div class="container" style="background: white;display: flex;height: 1200px">
            <div style="margin-top: 130px;"></div>
            <table border="1" class="table-bordered" style="margin-top: 250px;position: relative; text-align: center;
                   overflow: hidden;
                   box-shadow: 0 0px 40px 0px rgba(0, 0, 0, 0.15);
                   -moz-box-shadow: 0 0px 40px 0px rgba(0, 0, 0, 0.15);
                   -webkit-box-shadow: 0 0px 40px 0px rgba(0, 0, 0, 0.15);
                   -o-box-shadow: 0 0px 40px 0px rgba(0, 0, 0, 0.15);
                   -ms-box-shadow: 0 0px 40px 0px rgba(0, 0, 0, 0.15);">
                <thead>
                    <tr style="font-family: Lato-Bold;
                        font-size: 18px;
                        color: #fff;
                        line-height: 1.4;

                        background-color: #6c7ae0;">
                        <th>ID</th>
                        <th>Name</th>
                        <th>Account</th>
                        <th>Password</th>
                        <th>Email</th>
                        <th>Telephone</th>
                        <th>Date of birth</th>
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${requestScope.listAccount}" var="p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td>${p.account}</td>
                            <td> ${p.password}</td>
                            <td>${p.email}</td>
                            <td>${p.telephone}</td>
                            <td>${p.dob}</td>

                            <td><a href="update?id=${p.id}" />Update</td>
                            <td><a href="#" onclick="showMess(${p.id})"/>Delete</td>
<!--                            <td><a href="deleteaccount?id=${p.id}"/>Delete</td>-->
                        </tr>
                    </c:forEach>
                </tbody>
                <div style="background-color: #000000">

                    <a style="position: absolute;border: 5px solid #000000;background-color: #000000;color: white;text-decoration: none;    margin-left: central;
                       margin-top: 100px;" href="crudservlet">Back to products</a>
                </div>
            </table>
        </div>


        <section class="footer"  >
            <div class="container">
                <div class="row-2" >
                    <div class="title">
                        <a href="#" style="color: #999999;font-size: 30px;
                           padding: 10px 50px;text-decoration: none;display: block;text-align: center" />
                        Sunrise Auto<br> Luxury Automobiles
                    </div>
                </div>
            </div>
        </section>
    </body>
    <script>
        function showMess(id) {
            var option = confirm('Do you want to delete');
            if (option === true) {
                window.location.href = 'deleteaccount?id=' + id;
            }
        }
    </script>
</html>
