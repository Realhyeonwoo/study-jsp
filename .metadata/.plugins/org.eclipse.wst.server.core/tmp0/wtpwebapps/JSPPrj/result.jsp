<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = String.valueOf(request.getParameter("name"));
	String price = String.valueOf(request.getParameter("price"));
	String description = String.valueOf(request.getParameter("description"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품이 저장되었습니다.</h1>
	<h2>상품명    : <%=name %></h2>
	<h2>상품 가격: <%=price %></h2>
	<h2>상품 설명: <%=description %></h2>
</body>
</html>