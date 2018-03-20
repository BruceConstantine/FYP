<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
	<link rel="stylesheet" type="text/css"  href="style/style.css">
	<script src="js/main.js"></script>
	<title>登录测试</title>
</head>  
<body>
 	<% out.println("*** 登录 Hello World! *** "); %>
 	<br/>
 	<form id="loginFm" action="loginURL" method="post" > 
	 	<input id="username" name="un" type="text" ></input> 		<br/>
	 	<input id="password" name="pw" type="password"></input>	<br/>
		<button id="login" type="submit" > Login </button>
		<input id="reset" type="button" value="Reset"></input>
	</form> 
	<form id="browserFm" action="getWebContent" method="get">
		<input id="distUrl" type="text"> </input>
		<button id="goDistUrlBtn" type="submit" >Go!</button>
	</form>
	<div class="frame-container">  
		<iframe class="fc-ele" src="http://www.baidu.com" frameBorder=0 marginwidth=0 marginheight=0 scrolling=yes 
			 scrolling=no ALLOWTRANSPARENCY="true">
		</iframe>
		<iframe class="fc-ele" src="http://www.baidu.com" frameBorder=0 marginwidth=0 marginheight=0 scrolling=yes 
			scrolling=no ALLOWTRANSPARENCY="true">
		</iframe>
		<!--
		<iframe class="fc-ele" src="http://www.baidu.com" frameBorder=0 marginwidth=0 marginheight=0 scrolling=yes 
			scrolling=no ALLOWTRANSPARENCY="true">
		</iframe>
		-->  
		<p id="x"></p> : <p id="y"></p>
		<footer>footer </footer> 
	</div> 
</body>
</html> 
 