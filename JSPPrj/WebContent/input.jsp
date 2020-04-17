<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품을 등록 해 주세요.</h1>
	<form action="result.jsp" method="post">
		<div>
			<label>상품명:&nbsp;&nbsp;&nbsp;&nbsp; </label>
			<input type="text" name="name"/>
		</div>
		<div>
			<label>상품가격: </label>
			<input type="text" name="price"/>
		</div>
		<div>
			<label>상품설명: </label>
			<input type="text" name="description"/>
		</div>
		<br>
		<div>
			<input type="submit" name="operator" value="저장"/>
			<input type="reset" name="operator" value="취소"/>
		</div>	
	</form>
</body>
</html>