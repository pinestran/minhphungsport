<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css" ></style>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/login.css'/>"/>

</head>
<body class="full-img">

<div id="content" >
	<div id="login-session">
	<h2>Login Form</h2>
		<form action="" method="post" >
		  <div class="imgcontainer">
		    <img src="<c:url value='/resources/img/account.png'/>" alt="Avatar" class="avatar">
		  </div>
		
		  <div class="container">
		    <label for="uname"><b>email</b></label>
		    <input type="text" placeholder="Enter email" name="email" required>
		
		    <label for="psw"><b>Password</b></label>
		    <input type="password" placeholder="Enter Password" name="password" required>
		        
		    <button type="submit">Login</button>
		    <a href="#" id="register" style="text-align:center;">Register ${result}</a>
		   <!--  <label>
		      <input type="checkbox" checked="checked" name="remember"> Remember me
		    </label> -->
		  </div>
		
		  <div class="container" style="background-color:#f1f1f1">
		    <a href="<c:url value='/'/>"><button type="button" class="cancelbtn">Cancel</button></a>
		    <span class="psw"> <a href="#" class="forgot">Forgot password?</a></span>
	  	   </div>
		</form>	
	</div>
	<div id="forgot-session">
		<h2>Reset Password Form</h2>
		<form action="" method="post">
			<div class="imgcontainer">
		    <img src="<c:url value='/resources/img/account.png'/>" alt="Avatar" class="avatar">
		  </div>
		
		  <div class="container">
		    <label for="uname"><b>email</b></label>
		    <input type="text" placeholder="Enter email" name="email" required>
		
		    <button type="submit">Reset Password</button>
		  </div>
		
		  <div class="container" style="background-color:#f1f1f1">
		  	<a href="<c:url value='/'/>"><button type="button" class="cancelbtn">Cancel</button></a>
		    <span class="psw"><a href="#" class="backtosignin">Back To Signin</a></span>
		  </div>
		</form>
	</div>
	<div id="register-session">
	<h2>Register Form</h2>
		<form id="SubmitForm" action="" method="post">
		  <div class="imgcontainer">
		    <img src="<c:url value='/resources/img/account.png'/>" alt="Avatar" class="avatar">
		  </div>
		
		  <div class="container">
		  	<label for="uname"><b>First Name</b></label>
		    <input type="text" placeholder="Enter First Name" name="firstname" required>
		    
		    <label for="uname"><b>Last Name</b></label>
		    <input type="text" placeholder="Enter Last Name" name="lastname" required>
		    
		    <label for="uname"><b>email</b></label>
		    <input type="text" placeholder="Enter email" name="email" required>
		
		    <label for="psw"><b>Password</b></label>
		    <input type="password" placeholder="Enter Password" name="password" required>
		        
		    <button type="submit" data-popup-open="popup-1" >Register</button>
		    <a href="#" class="backtosignin" >Back To Signin</a>
		   <!--  <label>
		      <input type="checkbox" checked="checked" name="remember"> Remember me
		    </label> -->
		  </div>
		
		  <div class="container" style="background-color:#f1f1f1">
		    <a href="<c:url value='/'/>"><button type="button" class="cancelbtn">Cancel</button></a>
		    <span class="psw"> <a href="#" class="forgot">Forgot password?</a></span>
	  	   </div>
		</form>	
	</div>
		
	<div class="popup" data-popup="popup-1">
		<div class="popup-inner">
			<h2 id="type-json"></h2>
			<p id="message-json"></p>
			<p><a data-popup-close="popup-1" href="#">Close</a></p>
			<a class="popup-close" data-popup-close="popup-1" href="#">x</a>
		</div>
	</div>
</div>
<script type="text/javascript" src="<c:url value='/resources/js/login.js'/> "></script>
</body>
</html>
