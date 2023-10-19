<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex.SiteEV" %>
  <% 
  		//アプリケーションスコープからSiteEVインスタンスを取得
  		SiteEV site = (SiteEV)application.getAttribute("site");
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>みなとGood Bad</title>
</head>
<body>
	<h1>みなとくんのページにようこそ</h1>
	<a href="MinatoIndex?action=good">よいね:<%=site.getGood() %></a>
	<a href="MinatoIndex?action=bad">よくないね:<%=site.getBad() %></a>
</body>
</html>