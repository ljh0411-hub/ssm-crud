<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
</head>
<body>

<form action="${pageContext.request.contextPath }/emp/add"  >
    <div class="form-group">
			<label>员工姓名</label>
			<input type="text" class="form-control" placeholder="姓名" name="emp_name"> 
		</div>
		<div class="form-group">
			<label>性别</label>
			<input type="text" class="form-control" placeholder="性别" name="gender"> 
		</div>
		<div class="form-group">
			<label>邮箱</label>
			<input type="text" class="form-control" placeholder="邮箱" name="email"> 
		</div>
		<div class="form-group">
			<label>部门id</label>
			<input type="text" class="form-control" placeholder="部门id" name="d_id"> 
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-danger">添加</button>
			</div>
		</div>
</form>

</body>
</html>
