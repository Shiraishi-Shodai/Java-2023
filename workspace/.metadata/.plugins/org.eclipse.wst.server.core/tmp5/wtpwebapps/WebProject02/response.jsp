<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<!-- ここから追加1 -->
	<%
	// サーブレットから送られてきたテキストを受け取る
	String afterText = (String)request.getAttribute("afterServlet");
	%>
	<!-- ここまで追加1 -->
<body>
	<!-- ここから追加2 -->
	<!-- 画面に表示する -->
	<%=afterText %>
	<!-- ここまで追加2 -->
</body>
</html>