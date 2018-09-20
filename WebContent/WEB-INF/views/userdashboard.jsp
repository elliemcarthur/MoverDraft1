<%@ page import="springwork.controller.models.User" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<%@page buffer="8kb" %>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">

<title>Main DashBoard</title>
<style><%@include file="../css/index.css"%>


</style>
</head>

<body>

<div style=" height: 100%;" >
<%@
include file="header2.html"
%>
</div>
<div class="dash" style="margin-right: 30%; margin-left: 30%;">
<h1>Main <br> Dashboard</h1>

<table >
<tr>
		<td>First Name</td>
		<td>${user.fname}</td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td>${user.lname}</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td>${user.uname}</td>
	</tr>
	<tr>
	<td style="text-align:left;">Email</td>
	<td>${user.email}</td>
	</tr>
	
	<tr>
	<td><a style="color:aqua;" href="clientreg">Get Help Moving</a><td>
	<td><a style="color:aqua;" href="edituser?userid=${user.userid}">Edit</a></td>  
     <td><a style="color:aqua;" href="deleteuser?userid=${user.userid}">Delete</a></td>  
	</tr>
	</table>
	
	</div>
</body>
</html>