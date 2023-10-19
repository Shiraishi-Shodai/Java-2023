<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>スッキリ健康診断の結果</h1>
	<p>身長:${health.height }</p>
	<p>体重:${health.weight }</p>
	<p>BMI:${health.bmi }</p>
	<p>体型:${health.figure }</p>
	
	<a href="HealthCheck">戻る</a>
</body>
</html>