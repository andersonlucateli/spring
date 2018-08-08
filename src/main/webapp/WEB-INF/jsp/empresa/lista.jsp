<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/style.css"/>" rel="stylesheet">
<title>Lista de Empresas</title>
</head>
<body>
	<div class="conteiner">
		<a href="/empresa/novo">Nova Empresa	</a> 
		<a href="/cidade/novo">Nova	Cidade	</a>
		<a href="/">Sair</a>

		<table>
			<thead>
				<tr>
					<th>Código</th>
					<th>Nome</th>
					<th>CNPJ</th>
					<th>Cidade</th>
					<th>CEP</th>
					<th>Logradouro</th>
					<th>Número</th>
					<th>Bairro</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${empresas}" var="empresa">
					<tr>
						<td><a href="/empresa/visualizar/${empresa.codigo}">${empresa.codigo}</a></td>
						<td>${empresa.nome}</td>
						<td>${empresa.cnpj}</td>
						<td>${empresa.cidade.nome}</td>
						<td>${empresa.endereco.cep}</td>
						<td>${empresa.endereco.logradouro}</td>
						<td>${empresa.endereco.numero}</td>
						<td>${empresa.endereco.bairro}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>