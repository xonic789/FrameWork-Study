<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>입력페이지</h2>
	<form action="result.action">
		sabun: <input type="text" name="sabun" id="sabun"/>${fieldErrors.sabun }<br/>
		name: <input type="text" name="name" id="name"/>${fieldErrors.name }<br/>
		<button>입력</button>
	</form>
</body>
</html>