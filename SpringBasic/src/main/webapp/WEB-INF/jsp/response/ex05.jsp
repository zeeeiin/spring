<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>ModelAttribute로 넘어온 값</h3>

	${xxx } <!-- 넘어온 값 그대로 관통해서 받을 수 있다. -->
	<!-- 객체로 들어오는 거니까 이렇게 받을 수 있다. -->
	${xxx.name }
	${xxx.age }
	
</body>
</html>