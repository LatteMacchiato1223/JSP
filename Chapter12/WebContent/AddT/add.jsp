<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  
    errorPage="addException.jsp" %> 
<% 
   int num = Integer.parseInt(request.getParameter("num"));
   int sum = 0;
   for(int i = 1; i <= num; i++){
      sum = sum + i;
   }
%>

<!DOCTYPE html>          
<html>
	<head>
	    <title>Find the sum</title>
	    <meta charset="UTF-8">
	</head>
	<body>
		<h1>Find the sum</h1>
		<h2>The sum of 1 to <%=num  %> is <%=sum  %></h2>
	</body>
</html>