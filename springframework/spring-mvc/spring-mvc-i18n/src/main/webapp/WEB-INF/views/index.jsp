<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Spring I18n 测试</title>
	</head>
	<body>
		<h1><spring:message code="hello"/>,<spring:message code="world"/></h1>
		<hr>
		<h1><spring:message code="success"/></h1>
	</body>
</html>