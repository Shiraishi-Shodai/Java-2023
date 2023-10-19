<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  // Servletのデータ受け取り
  request.setCharacterEncoding("UTF8");
  String strName = (String) request.getAttribute("name");
  String strNickName = (String) request.getAttribute("nickname");
  String strGender = (String) request.getAttribute("gender");
  String strBirthArea = (String) request.getAttribute("birtharea");
  Boolean bAllowCollectLog = (Boolean) request.getAttribute("collectlog");
  Boolean bAllowSendInfoMail = (Boolean) request.getAttribute("sendinfomail");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンバー登録確認画面</title>
</head>
<body>
  <h2>名前</h2>
  <%=strName%>
  <h2>ニックネーム</h2>
  <%=strNickName%>
  <h2>性別</h2>
  <%=strGender%>
  <h2>出身地</h2>
  <%=strBirthArea%>
  <h2>オプション</h2>
  ・ログの収集：
  <%if( bAllowCollectLog != false ){%>
  同意
  <%}else{%>
  未同意
  <%}%>
  <br>
  ・お知らせメールの送信：
  <%if( bAllowSendInfoMail != false ){%>
  同意
  <%}else{%>
  未同意
  <%}%>
  <br>
  <br>
  <button type="button" onclick="history.back()">戻る</button>
</body>
</html>