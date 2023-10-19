<%@ page contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import=" java.text.SimpleDateFormat, java.util.Date" %>
<!DOCTYPE html>
<% 
	Date d = new Date();
	SimpleDateFormat f = new SimpleDateFormat("MM月dd日");
	String today = f.format(d);
	String [] luck = {"大吉", "中吉", "小吉", "凶"}; 
	int index = (int) (Math.random() * luck.length); 
	String ans = luck[index];
%>
<html>
	<head>
	</head>
	
	<body>
			<p><%=today %>の運勢は<%= ans %>です</p>
	</body>
</html>