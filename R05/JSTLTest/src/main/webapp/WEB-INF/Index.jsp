<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品一覧ページ</title>
</head>
<body>
		<p><c:out value="${h.age}"></c:out></p>
		<c:if test="${h.age > 10}">
  			あなたは成人です
		</c:if>
		
</body>
</html>