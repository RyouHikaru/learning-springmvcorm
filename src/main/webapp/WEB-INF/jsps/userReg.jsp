<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script>
$(document).ready(function() {
	
	// AJAX Call on every change in ID
	$("#id").change(function() {
		$.ajax({
			url: "validateEmail",
			data: {
				id: $("#id").val()
			},
			success: function(response) {
				$("#errMsg").text(response); // Append error message
				if (response != "") {
					$("#id").focus(); // Switch back to input field
				}
			}
		});
	});
});
</script>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
			ID: <input type="text" name="id" id="id"/> <span id="errMsg"></span>
			Name: <input type="text" name="name" />
			Email: <input type="text" name="email" />
			<input type="submit" name="register" />
		</pre>
	</form>
	<br/>${result}
</body>
</html>