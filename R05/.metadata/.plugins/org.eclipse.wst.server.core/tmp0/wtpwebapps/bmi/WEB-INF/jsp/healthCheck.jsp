<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>スッキリ健康診断</h1>
	<form action="HealthCheck" method="post">
		<label>身長:<input type="text" name="height">(cm)</label><br>
		<label>体重:<input type="text" name="weight">(kg)</label><br>
		<input type="submit" value="診断">
	</form>
</body>
</html>