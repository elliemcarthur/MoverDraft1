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
<main>
            <form>
                
            <div class="n">
                <label for="name">Name</label><br>
            <input type="text" id="name" name="name" maxlength="10">
            </div>
                
            <div class="tele">
            <label for="tel">Telephone</label><br>
            <input type="tel" name="tel" id="tel" required>
            </div>
                
            <div class="e">
            <label for="email">E-Mail</label><br>
            <input type="email" name="email" required>
            </div>
                
                <div class="cities">
                    <label for="Course">City*</label><br>
                    <select name="course" id="course" size="1">
            
                        <option value="br"><br></option>
                        <option value="Connecticut" >Connecticut</option>
                        <option value="nj">New Jersey</option>
                        <option value="ny" selected>New York</option>
                        <option value="Pennsylvania">Pennsylvania</option>
                    </select></div>
                
             <div class="mes">
            <label for="Message">Message</label><br>
            <textarea id="message" name="Message"></textarea>
            </div>
            
            <div class="button">
  <input type="submit" value="Submit" id="submit">
                </div></form>
          
        </main>
        
        <footer id="foot">
            <br>*At this time, Mover only operates in New York
            <br>
        Copyright &#64;2017 RLB Alliance LLC
        </footer>
	</body>
</html>