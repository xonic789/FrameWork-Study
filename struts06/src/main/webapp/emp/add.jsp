<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="insert.action" method="post">
		<div>
			<label for="sub">sub</label>
			<input type="text" name="sub" id="sub"/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name"/>
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay"/>
		</div>
		<div>
			<button>입 력</button>
		</div>
	</form>
</body>
</html>