<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Team</title>
</head>
<body>
	<h1>Create a new team</h1>
	<form action="/TeamRoster/Teams" method="post">
		<input type="text" name="teamName">
		<input type="submit" value="Create a team">
	</form>
	
</body>
</html>