<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="RegistredServlet">		
			<h1>注册账号</h1>
			<label for="username">账号</label>
			<input type="text" name="username" min="4" max="20" required pattern="[-\w\u4E00-\u9FA5]{4,10}"/>长度为4-20字节
			<br />
			<label for="password">密码</label>
			<input type="password" name="password" min="6" max="16" required pattern="[\dA-Za-z]{6,16}"/>长度为6-16字节
			<br />
			<label for="repassword">确认密码</label>
			<input type="password" name="repassword" min="6" max="16"required pattern="[\dA-Za-z]{6,16}"/>长度为6-16字节
			<br />
			<label for="tel">手机账号</label>
			<input type="text" name="tel" min="11" max="11" required pattern="1[3578]\d{9}"/>长度为11字节
			<br />
			<label for="email">邮箱</label>
			<input type="text" name="email" required pattern="^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$"/>
			<br />
			<input type="submit" value="注册" name="login">
			<br />	
		</form>

</body>
</html>