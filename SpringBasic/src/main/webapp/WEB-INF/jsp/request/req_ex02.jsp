<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>파라미터 값 받기</h3>
	
	<form action="parma1">
		name:<input type="text" name="name" />
		age:<input type="number" name="age"  />
		
		<input type="checkbox" name="inter" value="java"/>java
		<input type="checkbox" name="inter" value="spring"/>spring
		<input type="checkbox" name="inter" value="db"/>DB
		
		<button>submit (버튼 타입이 없으면 submit)</button>
		
	</form>
</body>
</html>