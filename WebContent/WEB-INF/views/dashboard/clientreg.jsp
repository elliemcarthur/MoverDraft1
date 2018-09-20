<%@ page import="springwork.controller.models.Customer" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<%@page buffer="8kb" %>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">

<title>Contact</title>
<style><%@include file="..//..//css//index.css"%></style>
</head>
<body>
<div style=" height: 100%;" >
<%@
include file="..//header2.html"
%>
</div>
<h1>Customer Registration</h1>

     <p>Client Box</p>

 
 <div class="registerbox" style="margin-top: 0%; margin-left: 42%; margin-right: 42%; padding: 1%;">

<form:form class ="unamebox" action="verifycustomer" method="post" modelAttribute="user">
       <div class="unamebox">
	 <br>
         <div class="unamebox">
	 <label for="un">User Id</label>
	 <form:input path="userid" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div><br>
   <div class="unamebox">
	 <label for="un">City</label>
	 <form:input path="city" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div>   
         <div class="tabb">
   
         </div>
         <br>
         <div class="subb">
         <input type="submit" value="Finish Registering" id="regbtn"></div>
            </div></form:form></div>

</html>