<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome"> Nome </label>
<input type="text" name="nome" id="nome" value="${empresa.nome}">
<form:errors path="pessoa.nome" />

<br />

<label for="cnpj"> CNPJ </label>
<input type="text" name="cnpj" id="cnpj" value="${empresa.cnpj}">
<form:errors path="empresa.cnpj" />

<br />

<label for="cep"> CEP </label>
<input type="text" name="endereco.cep" id="cep" value="${empresa.endereco.cep}">

<br />

<label for="bairro"> Bairro </label>
<input type="text" name="endereco.bairro" id="bairro" value="${empresa.endereco.bairro}">

<br />

<label for="logradouro"> Logradouro </label>
<input type="text" name="endereco.logradouro" id="logradouro" value="${empresa.endereco.logradouro}">

<br />

<label for="numero"> Numero </label>
<input type="text" name="endereco.numero" id="numero" value="${empresa.endereco.numero}">

<br />

<label for="cidade">Cidade</label>
<select id="cidade" name="cidade.codigo">
	<option></option>
	<c:forEach items="${cidades}" var="cidade">

		<c:set var="selecionado" value="" />
		<!-- "eq" mesmo que "==" -->
		<c:if test="${cidade.codigo eq empresa.cidade.codigo}">
			<c:set var="selecionado" value="selected" />
		</c:if>
		<option value="${cidade.codigo}" ${selecionado}>${cidade.nome}</option>
	</c:forEach>
</select>

<br />