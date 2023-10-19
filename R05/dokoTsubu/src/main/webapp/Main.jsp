<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="model.User,model.Error,model.Mutter,java.util.List,java.util.ArrayList" %>
<%
	//セッションスコープからUserインスタンスを取得
	User user = (User)session.getAttribute("user");
	//アプリケーションスコープからUserインスタンスを取得
	List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");
	//リクエストスコープからErrorインスタンスを取得
	Error e = (Error)request.getAttribute("error");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
	<h1>どこつぶメイン</h1>
	<div>
		<%=user.getName() %>さん、ログイン中 <a href="LogOut">ログアウト</a>
	</div>
	<a href="Main?action=update">更新</a><br>
	<form action="Main" method="post">
		<label><input type="text" name="mutter"></label>
		<input type="submit" value="つぶやく">
	</form>
	
	<%if(e != null){ %>
		<p><%=e.getError() %></p>
	<%} %>
	
	<ul>
			<%if(mutterList != null) {%>
			<p>リストサイズ:<%=mutterList.size() %></p>
				<%for(Mutter m : mutterList) {%>
					<li><%=m.getUserName() %>:<%=m.getText() %></li>
					<%} %>
			<%} %>
	</ul>
</body>
</html>