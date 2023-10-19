<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" %>
  <%@ page import="ex.RegisterUser" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
	<form action="RegisterUser" method="post">
		<div>
			<label>ログインID:<input type="text" name="login"></label>
		</div>
		<div>
			<label>パスワード:<input type="text" name="pass"></label>
		</div>
		<div>
			<label>名前::<input type="text" name="name"></label>
		</div>
		<input type="submit" value="確認">
	</form>
</body>
</html>