<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./common/header.jsp"></jsp:include>
<body>
	<nav class="navbar navbar-default">
  		<div class="container-fluid">
  			<div class="navbar-header">
		      	<a class="navbar-brand" href="./index.jsp">首页</a>
		    </div>
    
  			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		    	<ul class="nav navbar-nav">
		        	<li class="active"><a href="#">用户管理 </a></li>
		        	<li><a href="#">菜单管理</a></li>
		        	<li class="dropdown">
		          		<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">系统管理<span class="caret"></span></a>
		          		<ul class="dropdown-menu">
				            <li><a href="#">小师</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="#">国中</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="#">见红</a></li>
		          		</ul>
		        	</li>
		      	</ul>
		      	<ul class="nav navbar-nav navbar-right">
		      		<li><a href="./logout.action">退出</a></li>
		      	</ul>
		 	</div>
		</div>
	</nav>
  
</body>
</html>