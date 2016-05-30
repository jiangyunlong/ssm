<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test project</title>
</head>
<body>
	<form name='f' action='/login.action' method='POST'>
		<table>
			<tr><td>User:</td><td><input type='text' name='username' value=''></td></tr>
			<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
			<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
			<!-- <input name="_csrf" type="hidden" value="4a5287c1-1c67-420b-9281-581562982ab7" /> -->
		</table>
	</form>
</body>
</html>