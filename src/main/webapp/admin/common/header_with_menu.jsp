<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../../jquery/jquery-1.10.1.min.js"></script>
<script src="../../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
  		<div class="container-fluid">
  			<div class="navbar-header">
		      	<a class="navbar-brand" href="./index.jsp">
					<img alt="logo" src="./images/logo.jpg" width="35" height="35">
				</a>
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
