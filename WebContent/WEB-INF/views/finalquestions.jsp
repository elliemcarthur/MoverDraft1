<%@ page import="springwork.controller.models.User" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<%@page buffer="8kb" %>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">

<title>${msg} ${user.uname}</title>
<style><%@include file="../css/index.css"%>


</style>
</head>
<body>

<div style=" height: 100%;" >
<%@
include file="header1.html"
%>
</div>
 <h2>Almost there!  What is your first name and last name?</h2>
 <div class="registerbox" style="margin-top: 0%; margin-left: 42%; margin-right: 42%; padding: 1%;">

<form:form class ="unamebox" action="userdashboard" method="post" modelAttribute="user">
       <div class="unamebox">
	 <br>
         <div class="unamebox">
	 <label for="un">First Name</label>
	 <form:input path="fname" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div><br>
   <div class="unamebox">
	 <label for="un">Last Name</label>
	 <form:input path="lname" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div>   
         <div class="tabb">
   
         </div>
         <br>
         <div class="subb">
         <input type="submit" value="Finish Registering" id="regbtn"></div>
            </div></form:form></div>

</body>
</html>