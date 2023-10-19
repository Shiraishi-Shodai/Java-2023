<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
	//セッションスコープからUserを取得
	User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>どこつぶログイン</h1>
	
	<% if(user != null){ %>
		<p>ログインに成功しました</p>
		<p>ようこそ<%= user.getName() %>さん</p>
		<a href="Main">つぶやき・投稿へ</a>
	<%}else{%>
		<p>ログインに失敗しました<p>
		<a href="Index">TOPへ</a>
	<% } %>
</body>
</html>