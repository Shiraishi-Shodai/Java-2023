<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
	User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記のユーザーを登録します</p>
	<p>ログインID：<%=user.getId() %></p>
	<p>名前：<%=user.getName() %></p>
	<a href="RegisterUser">戻る</a>
	<a href="RegisterUser?action=touroku">登録</a>
</body>
</html>