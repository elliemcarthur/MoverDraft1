<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="springwork.controller.models.User" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<%@page buffer="8kb" %>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">

<title>Edit</title>
<style><%@include file="../css/index.css"%></style>
</head>
<body>
<div style=" height: 100%;" >
<%@
include file="header1.html"
%>
</div> 
          <br>

              <div class="reglogin"  > 

        <div class="registerbox" style="margin-top: 0%; ">

      <form:form class ="unamebox" action="userdashboard" method="post" modelAttribute="user">
       <div class="unamebox">
	 <br>
         <div class="unamebox">
	 <label for="un">User name</label><br>
	 
	 <form:input path="uname" type="text" id="un" name="uname"  maxlength="15"></form:input>
         </div><br>
         <div class="unamebox">
	 <label for="city">City</label><br>
	 <form:input path="city" type="text" id="un" name="city" value="New York" maxlength="15"></form:input>
         </div><br>
       
         <div class="unamebox">
         <label for="un">First Name</label><br>
	 <form:input path="fname" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div><br>
   <div class="unamebox">
	 <label for="un">Last Name</label><br>
	 <form:input path="lname" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div>  <br>
         <div class="passb">
         <label for="passw">Password</label><br>
         <form:input path="pass" type="password" id="pass" name="pass"
                maxlength="15"></form:input>
         </div> <br>
          <div class="passb2">
         <label for="passw2">Retype Password</label><br>
         <form:input path="passw2" type="password" id="passw2" name="passw2"
                maxlength="15"></form:input>
         </div><br> 
             <div class="emailb">
         <label for="email"> Email</label><br>
         <form:input path="email" type='email' name="email" id="eml" maxlength="100"></form:input></div>
        <br>       
	  
        
         <div class="subb">
         <input type="submit" value="Make changes" id="regbtn"></div>
            </div></form:form></div>
            </div>
       
         <footer id="foot">
        Copyright &#64;2017 RLB Alliance LLC</footer>
	</body>
</html>