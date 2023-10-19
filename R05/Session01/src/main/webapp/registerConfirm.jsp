<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" %>
<%@ page import="ex.User" %>
<%
	//セッションスコープからuserインスタンスを取得
	User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
	<p>下記のユーザーを登録します<p>
	<p>ログインID:<%=user.getId() %><p>
	<p>名前:<%=user.getName() %><p>
	<a href="RegisterUser">戻る</a>
	<!-- action name属性にdoneを代入 -->
	<a href="RegisterUser?action=done">登録</a>
</body>
</html>