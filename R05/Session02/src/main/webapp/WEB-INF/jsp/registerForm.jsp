<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="servlet.RegisterUser" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterUser" method="post">

			ログインID:<input type="text" name="id"><br>
			パスワード:<input type="password" name="password"><br>
			名前:<input type="text" name="name"><br>
			<input type="submit" value="送信">
	</form>
</body>
</html>