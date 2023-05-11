<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true" %>

<!DOCTYPE html>          
<html>
	<head>
	   <title>Error page</title>
	   <meta charset="UTF-8">
	</head>
	<body>
	    ====== toString() content ======= <br>
   		<%= exception.toString()  %> <br><br>
		====== getMessage()content =======<br>
   		<%=exception.getMessage()%> <br><br>
	   	====== printStackTrace() content =======<br>
   		<% exception.printStackTrace(); %> 
   		Only numbers are allowed Please try again
   		<a href='add.html'>Restart</a>
	</body>
</html>