<%@ page import="springwork.controller.models.Customer" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<%@page buffer="8kb" %>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">

<title>Contact</title>
<style><%@include file="..//css//index.css"%></style>
</head>
<body>
<div style=" height: 100%;" >
<%@
include file="header2.html"
%>
</div>
<h1>Customer Registration</h1>

     <p>Client Dashboard</p>

<table >
<tr>
		<td>Custid</td>
		<td>${customer.custid}</td>
	</tr>
	<tr>
		<td>Userid</td>
		<td>${customer.userid}</td>
	</tr>
	<tr>
		<td>City</td>
		<td>${customer.city}</td>
	</tr>
	<tr>
	<td style="text-align:left;">Email</td>
	<td>${user.email}</td>
	</tr>
	
	<tr>

	<td><a style="color:aqua;" href="listofpartners">Get List Of Partners</a></td>  
  
	</tr>
	</table>
	

</html>