<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome"> Nome </label>
<input type="text" name="nome" id="nome" value="${cidade.nome}">
<form:errors path="cidade.nome" />

<br />

<label for="uf"> UF </label>
<input type="text" name="uf" id="uf" value="${cidade.uf}">
<form:errors path="cidade.uf" />

<br />

