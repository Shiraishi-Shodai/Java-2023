<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="ex.Fruit" %>
  <% Fruit f = (Fruit)request.getAttribute("f"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=f.getPrice()%>円の<%=f.getName() %></h1>
</body>
</html>