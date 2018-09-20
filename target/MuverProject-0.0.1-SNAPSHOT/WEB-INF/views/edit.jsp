<%@ page import="springwork.controller.models.User" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Info</title>
</head>
<body>
<h1>Edit Information</h1>  
       <form:form method="POST" action="/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="email" /></td>  
         </tr>
         <tr>
         <td>User Name</td>
         </tr>   
         <tr>    
          <td>Password : </td>   
          <td><form:input path="pass"  /></td>  
         </tr>    
         <tr>    
          <td>Retype Password :</td>    
          <td><form:input path="passw2" /></td>  
         </tr>   
         <tr>    
          <td>Email :</td>    
          <td><form:input path="email" /></td>  
         </tr>   
           <tr>    
          <td>First Name :</td>    
          <td><form:input path="fname" /></td>  
         </tr>
         <tr>    
          <td>Last Name :</td>    
          <td><form:input path="lname" /></td>  
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>