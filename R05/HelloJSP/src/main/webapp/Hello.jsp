<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--Java --%>
<%
		String name = "白石　翔大";
		int age = 19;
%>
	  <% for(int i = 0;i<5;i++){ %>
			<p>こんにちは</p>
		<% }%>

<%--HTML --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>私の名前は<%= name %>。<%= age %>歳です</p>
</body>
</html>