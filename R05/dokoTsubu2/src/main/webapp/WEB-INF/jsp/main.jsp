<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User,model.Mutter"  %>
    <%@ page import="java.util.List" %>
<%
	//セッションスコープからUserを取得
	User user = (User)session.getAttribute("user");
//アプリケーションスコープからlistを取得
	List<Mutter> list = (List<Mutter>)application.getAttribute("list");
	//リクエストスコープからerrorを取得
	String error = (String)request.getAttribute("error");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>どこつぶメイン</h1>
	<p><%= user.getName() %>さん、ログイン中<a href="Index">ログアウト</a></p>
	<form action="Main" method="post">
		<a href="Main">更新</a>
		<input type="text" name="text">
		<input type="submit" value="つぶやく"><br>
	</form>

	<%if(error != null){ %>
		<p><%=error %></p>
	<%} %>
	<!--listがnullでないとき つぶやき一覧を表示 -->
	<%if(list != null){ %>
		<%for(Mutter m: list){ %>
			<p><%=m.getUser().getName() + ":" + m.getText() %></p>
		<% } %>
	<% } %>
</body>
</html>