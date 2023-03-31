<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
			ID: <input type="text" name="id" />
			Name: <input type="text" name="name" />
			Email: <input type="text" name="email" />
			<input type="submit" name="register" />
		</pre>
	</form>
	<br/>${result}
</body>
</html>