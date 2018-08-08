<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/style.css"/>" rel="stylesheet">
<title>Lista de Cidades</title>
</head>
<body>
	<div class="conteiner">
		<a href="/cidade/novo">Nova Cidade	</a> <a href="/">Voltar	</a>

		<table>
			<thead>
				<tr>
					<th>Código</th>
					<th>Nome</th>
					<th>UF</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cidades}" var="cidade">
					<tr>
						<td>${cidade.codigo}</td>
						<td>${cidade.nome}</td>
						<td>${cidade.uf}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>