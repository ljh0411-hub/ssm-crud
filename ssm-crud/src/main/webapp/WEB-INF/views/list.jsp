<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
	<table class="table table-striped table-bordered table-hover">
		<caption class=" "><b>员工信息系统</b></caption>
		<thead>
			<tr>
				<th>员工id</th>
        		<th>员工姓名</th>
       			<th>性别</th>
        		<th>邮箱</th>
        		<th>部门id</th>
       			<th>部门名</th>
				<th colspan="3" align="left">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="emp">
			<tr>
				<<td>${emp.emp_id}</td>
            	<td>${emp.emp_name}</td>
            	<td>${emp.gender}</td>
            	<td>${emp.email}</td>
            	<td>${emp.d_id}</td>
            	<td>${emp.department.dept_name}</td>
				<td>
					<button class="btn btn-info" type="button">
					<a href="${pageContext.request.contextPath }/emp/goUpdate?id=${emp.emp_id }">修改</a>
					</button>
				</td>
				<td>
					<button class="btn btn-info" type="button">
					<a href="${pageContext.request.contextPath }/emp/del?emp_id=${emp.emp_id }">删除</a>
					</button>
				</td>
				<td>
					<button class="btn btn-info" type="button">
					<a href="${pageContext.request.contextPath }/emp/goAdd">添加</a>
					</button>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>