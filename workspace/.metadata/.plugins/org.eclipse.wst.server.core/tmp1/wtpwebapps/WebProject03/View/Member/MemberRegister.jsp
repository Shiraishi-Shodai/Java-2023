<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンバー登録画面</title>
</head>
<body>
  <form action="<%= request.getContextPath() %>/MemberConfirm" method="post">
    <h2>名前</h2>
    <input type="text" name="name" />
    <h2>ニックネーム</h2>
    <input type="text" name="nickname" />
    <h2>性別</h2>
    <input type="radio" name="gender" value="empty" checked>未指定<br>
    <input type="radio" name="gender" value="female">女性<br>
    <input type="radio" name="gender" value="male">男性
    <h2>出身地</h2>
    <SELECT name="birtharea">
      <OPTION value="empty" selected>未指定</OPTION>
      <OPTION value="hkd">北海道</OPTION>
      <OPTION value="thk">東北</OPTION>
      <OPTION value="knt">関東</OPTION>
      <OPTION value="chb">中部</OPTION>
      <OPTION value="knk">近畿</OPTION>
      <OPTION value="cgk">中国</OPTION>
      <OPTION value="skk">四国</OPTION>
      <OPTION value="kso">九州沖縄</OPTION>
    </SELECT>
    <h2>オプション</h2>
    <input type="checkbox" name="optionagree" value="collectlog" >ログの収集を許可します<br>
    <input type="checkbox" name="optionagree" value="sendinfomail" >お知らせメールの送信を許可します<br><br>
    <input type="submit" value="確認画面に進む">
  </form>
</body>
</html>