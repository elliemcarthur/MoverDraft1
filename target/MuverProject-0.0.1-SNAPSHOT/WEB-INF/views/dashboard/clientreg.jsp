<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

              <div class="reglogin"  > 


    
        <div class="registerbox" style="margin-top: 0%; ">
<ul style="text-align: left;  margin-top: 0%; margin-left: 0%; padding:0%;">
  <li  style="display: inline; border-right: inset;text-align: left; margin-left: 0%;">
 REGISTER </li>
    <li style="background-color: #afc3c3;display: inline;  margin-left: 0%;  border-bottom: inset ; "><a href="login" style="padding-right:48.5%;
       ">LOGIN</a></li></ul>
      <form:form class ="unamebox" action="registersubmission" method="get" modelAttribute="user">
       <div class="unamebox">
	 
         <div class="unamebox">
	 <label for="un">Username</label><br>
	 <form:input path="uname" type="text" id="un" name="uname" maxlength="15"></form:input>
         </div>
         <div class="passb">
         <label for="passw">Password</label><br>
         <form:input path="pass" type="password" id="pass" name="pass"
                maxlength="15"></form:input>
         </div> 
          <div class="passb2">
         <label for="passw2">Retype Password</label><br>
         <form:input path="passw2" type="password" id="passw2" name="passw2"
                maxlength="15"></form:input>
         </div> 
             <div class="emailb">
         <label for="eml"> Email</label><br>
         <form:input path="email" type='email' name="email" id="eml" maxlength="100"></form:input></div>
         <div class="tabb">
         <table>
             <tr>
             <td>
                 <input type="checkbox" name="tnc" id="tnc" value="Yes" checked>
                 </td>
             <td>
                 <label for="tnc">I agree to the terms and conditions*</label>
                 </td>
           </table>
         </div>
         <div class="subb">
         <input type="submit" value="Register" id="regbtn"></div>
            </div></form:form></div>
            </div>
	</body>
</html>