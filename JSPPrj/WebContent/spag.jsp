<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	pageContext.setAttribute("r", "hello");
%>
<body>
	<%=request.getAttribute("r") %>입니다.<br>
	${requestScope.r}입니다.<br>
	${r}입니다.<br>
	${names[0]}<br>
	${notice.title}<br>
	${empty param.n}<br>
	${not empty param.n}
</body>
</html>