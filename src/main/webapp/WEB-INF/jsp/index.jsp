<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/style.css"/>" rel="stylesheet">

<title>Spring-Boot-MVC</title>
</head>
<body>
	<div class="conteiner">
		<div class="box">
			<h1>${valor}</h1>

			<a class="btn btn-primary" href="/empresa/listar" role="button">Listar Empresas</a>
			<br /><br /> 
			<a href="/empresa/novo">Cadastrar Empresa</a>
			<br />
			<a href="/cidade/lista">Cidades</a>
		</div>
	</div>
</body>
</html>