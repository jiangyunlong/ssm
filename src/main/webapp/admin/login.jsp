<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./common/header.jsp"></jsp:include>
<link href="./css/signin.css" rel="stylesheet">
<body>
	<div class="container">

      <form class="form-signin" action='./login.action' method='POST'>
        <h2 class="form-signin-heading">请登录</h2>
        <label for="username" class="sr-only">用户名</label>
        <input type="username" id="username" name="username" class="form-control" placeholder="用户名" required autofocus>
        <label for="password" class="sr-only">密码</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="密码" required>
        <div class="checkbox">
          	<label>
            	<input type="checkbox" name="rememberMe" value="on"> 记住我
          	</label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>

    </div>
</body>
</html>