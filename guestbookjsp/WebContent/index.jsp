<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String root = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY</title>
</head>
<body>
<div align="center">
<h3>SSAFY 방명록!!!(JSP)</h3>
<a href="<%= root %>/guestbook/write.jsp">글쓰기</a><br>
<a href="<%= root %>/articlelist.do">글목록</a>
</div>
</body>
</html>