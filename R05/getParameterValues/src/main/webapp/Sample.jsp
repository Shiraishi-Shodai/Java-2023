<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form action="Check.jsp" method="post">
			<fieldset>
				<legend>あなたがよく使用するサーバーサイド技術は？</legend>
				<div>
					<input id="jsp" type="checkbox" name="answer" value="JSP&サーブレット">
					<label for="jsp">JSP&サーブレット</label>
				</div>
				<div>
					<input id="php" type="checkbox" name="answer" value="PHP">
					<label for="php">PHP</label>
				</div>
				<div>
					<input id="aspnet" type="checkbox" name="answer" value="ASP.NET">
					<label for="anpnet">ASP.NET"</label>
				</div>
				
				<input type="submit" value="送信">
			</fieldset>
		</form>
		
</body>
</html>