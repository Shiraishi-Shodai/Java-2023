<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録もどき</title>
</head>
<body>

	<form action= "Example" method="post">
		名前：<input type="text" name= "name">
		<input type="radio" name= "gender" value = "男性">男
		<input type="radio" name= "gender" value = "女性">女
		<input type="submit" name= "submit" value = "登録" >
	</form>
	
</body>
</html>