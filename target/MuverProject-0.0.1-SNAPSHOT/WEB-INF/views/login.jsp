<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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


        <div class="registerbox" style="margin-top: 0%; ">
<ul style="text-align: left;  margin-top: 0%; margin-left: 0%; padding:0%;">
  <li  style="background-color: #afc3c3;display: inline; border-right: inset ; border-bottom: inset black ;text-align: left; margin-left: 0%;">
 <a href="register">REGISTER</a> </li>
    <li style="display: inline;  margin-left: 0%; "><scan style="padding-right:39%;
       ">LOGIN</scan></li></ul>
      <form class ="unamebox" action="register.php" method="post">
         <table><div class="unamebox">
	 <label for="un">Username</label><br>
	 <input type="text" id="un" name="un" maxlength="15">
         </div>
         <div class="passb">
         <label for="passw">Password</label><br>
         <input type="password" id="passw" name="passw"
                maxlength="15">
         </div> 
   <br>
   <br>
   
   
                <td>
                 <input type="checkbox" name="tnc" id="tnc" value="Yes" checked>
                 </td>
             <td>
                 <label for="tnc">I agree to the terms and conditions*</label>
                 </td>
                 </div>
     
         <input type="submit" value="Log In" id="regbtn"></div>
         <br><br>
                 </div>
          <%--forgot password --%>
         <input type="submit" value="I forgot my password" id="regbtn"></div>
           </table>
         
            </form>
            </div>
       
         <footer id="foot">
        Copyright &#64;2017 RLB Alliance LLC</footer>
	</body>
</html>