<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/style.css"/>" rel="stylesheet">
<title>Cadastro Cidade</title>
</head>
<body>
	<div class="conteiner">
		<div class="box">
			<form action="/cidade/salvar" method="post">

				<c:import url="_campos.jsp" />

				<button type="submit">Salvar</button>
				<a href="/cidade/lista">Cancelar</a>
			</form>
		</div>
	</div>
</body>
</html>