<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>ログイン</h1>
	
	<form action="LoginServlet" method="post">
	
		ユーザーID：<input type="text" name="userId"><br>
		パスワード：<input type="text" name="pass"><br>
		
		送信<input type="submit">
		
	</form>
</body>
</html>