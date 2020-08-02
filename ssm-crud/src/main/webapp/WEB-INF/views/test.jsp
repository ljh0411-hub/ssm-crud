<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="/ssm-crud/src/main/webapp/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
</head>
<body>
<form action="${pageContext.request.contextPath }/emp/add"  >
    员工姓名:<input id="name" type="text" name="emp_name"></br>
    性别:<input id="gender" type="text" name="gender"></br>
    邮箱：<input id="email" type="text" name="email"></br>
    部门id：<input id="d_id" type="text" name="d_id"></br>
    <input type="submit" value="提交">

</form>
</body>
</html>