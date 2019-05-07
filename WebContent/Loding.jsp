<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="LodingServlet" method="post">
	<table  border="1"  >
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<td>密&nbsp;&nbsp;码:</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td><input type="submit" value="登录" name="login"></td>
			<td><input type="reset" value="重置" name="reset"></td>
		</tr>
	</table>
	<p ><a href="Registred.jsp" >注册用户</a></p>
	</form>

</body>
</html>