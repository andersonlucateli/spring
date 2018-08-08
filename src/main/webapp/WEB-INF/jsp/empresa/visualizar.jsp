<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/style.css"/>" rel="stylesheet">
<title>Alterar Pessoa</title>
</head>
<body>
	<div class="conteiner">
		<div class="box">
			<form action="/empresa/alterar" method="post">

				<input type="hidden" name="codigo" value="${empresa.codigo}">
				<input type="hidden" name="cod_end" value="${empresa.endereco.codigo}">
				
				<c:import url="_campos.jsp" />

				<button type="submit">Salvar</button>
				<a href="/empresa/listar">Cancelar</a> <a
					href="/empresa/deletar/${empresa.codigo}/${empresa.endereco.codigo}">Remover</a>
			</form>
		</div>
	</div>
</body>
</html>