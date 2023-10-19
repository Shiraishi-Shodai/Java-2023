<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記のユーザーを登録します</p>
	<p>ログインID: ${u.id}</p>
	<p>名前: ${u.name}</p>
	<a href="RegisterUser">戻る</a>
	<a href="RegisterUser?action=put">登録</a>
</body>
</html>