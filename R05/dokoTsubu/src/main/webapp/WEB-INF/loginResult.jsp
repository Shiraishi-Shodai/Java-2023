<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
	//セッションスコープからUserインスタンスを取得
	User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン結果</title>
</head>
<body>
	<%if(user != null){%>
		<h1>どこつぶログイン</h1>
		<p>ログインに成功しました</p>
		<p>ようこそ<%=user.getName() %>さん</p>
		<a href="Main">つぶやきの投稿・一覧へ</a>
	<%}else{%>
		<h1>どこつぶログイン</h1>
		<p>ログインに失敗しました</p>
		<a href="index.jsp">トップへ</a>
	<%} %>
</body>
</html>