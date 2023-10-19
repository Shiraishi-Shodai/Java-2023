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

	<c:forEach var="product"  items="${cart}">
		<p><c: out value="${product.value.name}"  /></p>
	</c:forEach>



</body>
</html>