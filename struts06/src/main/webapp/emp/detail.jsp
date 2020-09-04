<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세보고 수정하기</h1>
	<form action="update.action">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun" value="${bean.sabun }" readonly/>
		</div>
		<div>
			<label for="sub">sub</label>
			<input type="text" name="sub" id="sub" value="${bean.sub }"/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name" value="${bean.name }"/>
		</div>
		<div>
			<label for="nalja">nalja</label>
			<input type="datetime" id="nalja" value="${bean.nalja }"/>
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay" value="${bean.pay }"/>
		</div>
		<div>
			<button>수정</button>
		</div>
	</form>
	<a href="delete.action?sabun=${bean.sabun }">삭제</a>
</body>
</html>
