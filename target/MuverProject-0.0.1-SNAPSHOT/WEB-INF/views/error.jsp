<%@ page language="java" import="java.io.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
        <%@ page import="springwork.controller.models.User" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<%@page buffer="8kb" %>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">

<title>Log In</title>
<style><%@include file="../css/index.css"%></style>
</head>
<body>
<div style=" height: 100%;" >
<%@
include file="header1.html"
%>
</div> 
<h1>ERROR!</h1>
<%=exception.getMessage()%>

         <footer id="foot">
        Copyright &#64;2017 RLB Alliance LLC</footer>
	</body>
</html>