<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>      <%@ page import="springwork.controller.models.User" %>
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
          <br>

              <div class="reglogin"  > 
<p>${message}</p>

        <div class="registerbox" style="margin-top: 0%; ">
<ul style="text-align: left;  margin-top: 0%; margin-left: 0%; padding:0%;">
  <li  style="background-color: #afc3c3;display: inline; border-right: inset ; border-bottom: inset black ;text-align: left; margin-left: 0%;">
 <a href="register">REGISTER</a> </li>
    <li style="display: inline;  margin-left: 0%; "><scan style="padding-right:39%;
       ">LOGIN</scan></li></ul>
      <form:form class ="unamebox" action="login" method="post" modelAttribute="user">
         <table><div class="unamebox">
	
       <div class="unamebox">
	 
         <div class="unamebox">
	 <form:label path="uname" for="un">User name</form:label><br>
	 <form:input path="uname" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div>
      

         <div class="passb">
         <form:label path="pass" for="pass">Password</form:label><br>
         <form:input path="pass" type="password" id="pass" name="pass"
                maxlength="15"></form:input>
         </div> 
                <td>
                 <input type="checkbox" name="tnc" id="tnc" value="Yes" checked>
                 </td>
             <td>
                 <label for="tnc">I agree to the terms and conditions*</label>
                 </td>
                 </div>
     
         <input type="submit" value="submit" id="regbtn"></div>
         <br><br>
                 </div>
         
           </table>
         
            </form:form>
            
            </div>
       
         <footer id="foot">
        Copyright &#64;2017 RLB Alliance LLC</footer>
	</body>
</html>