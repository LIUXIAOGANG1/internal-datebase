<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Spring 验证演示</title>
		
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="http://skype.gmw.cn/resource/jquery/jquery-2.1.1.min.js"></script>
		<script src="http://skype.gmw.cn/resource/bootstrap/2.3.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="http://skype.gmw.cn/resource/bootstrap/2.3.2/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<c:choose><c:when test="${successMsg != null }">
			<div class="alert alert-success">
				${successMsg}
			</div>
			</c:when></c:choose>
			

			<div class="row">
				<div class="span2"></div>
				<div class="span6">
					<h3 class="text-info text-center">Spring MVC 表单验证演示</h3>
					<form:form action="${pageContext.request.contextPath}/standard.html" method="POST" commandName="user">
						<div class="control-group">
							<label class="control-label" for="username">用户名</label>
							<div class="controls">
								<form:input path="username" id="username" type="text" /><form:errors path="username" cssClass="error" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-labelj" for="password">密码</label>
							<div class="controls">
								<form:input path="password" id="password" type="password" /><form:errors path="password" cssClass="error" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="email">邮箱</label>
							<div class="controls">
								<form:input path="email" id="email" type="text" /><form:errors path="email" cssClass="error" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="telephone">座机</label>
							<div class="controls">
								<form:input path="telephone" id="telephone" type="text" /><form:errors path="telephone" cssClass="error" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="mobile">手机</label>
							<div class="controls">
								<form:input path="mobile" id="mobile" type="text" /><form:errors path="mobile" cssClass="error" />
							</div>
						</div>
						<div class="control-group">
							<div class="controls">
								<button type="submit" class="btn">登陆</button>
							</div>
						</div>
					</form:form>
				</div>
				<div class="span4"></div>
			</div>
		</div>
	</body>
</html>