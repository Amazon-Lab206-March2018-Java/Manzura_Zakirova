<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.util.* " %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkerboard</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<% if (request.getParameter("width") != null && request.getParameter("height") != null) { %>
		<% Integer width = Integer.parseInt(request.getParameter("width")); 
		   Integer height = Integer.parseInt(request.getParameter("height")); %> 
		   <h1>Checkerboard <%=height %>h and <%=width %>w</h1>
		<% for(int row = 0; row < height; row++) { %>  
				<div class="row">
						<% for(int box = 0; box < width; box++) { %> 
							<% if (row % 2 == 0){ %> 
								<% if (box % 2 == 0){ %> 
									<div class="blue"></div> 
								<% } else { %>
									<div class="purple"></div> 
								<% } %>
							<% } else { %>  
								<% if (box % 2 == 0){ %>
								    <div class="purple"></div>
								<% } else { %>
								    <div class="blue"></div> 
								<% } %>
							<% } %>
						<% } %>
				</div>
		<% } %>
	<% } else { %>
		 <p>Please add height and width to construct a checkerboard</p>
	<% } %>
</body>
</html>