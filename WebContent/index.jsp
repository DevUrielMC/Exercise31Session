
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSP Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<link rel="stylesheet" href="css/styles.css">
<link>

</head>
<body>
	<h2>LOGIN</h2>
	<form class="form-group" action="loginServlet" method ="post">
	<p>
		<label for="txtUserName">Username:</label>
		<input type="text" id="txtUserName" name="txtUserName">
	</p>
	<p>
		<label for="txtPassword">Password:</label>
		<input type="password" id="txtPassword" name="txtPassword">
	</p>
	<input type="submit" value="Login">
	
	
	
	</form>


	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

	<script src="js/script.js"></script>
</body>
</html>