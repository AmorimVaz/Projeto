<%@page import="projeto.barbearia.modelo.Servico"%>
<%@page import="projeto.barbearia.colecao.DaoServico"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<thead>
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>Valor</th>
		</tr>
	</thead>
	
	<tbody>
	<% for( Servico s : new DaoServico().listarServico() ){%>
			<tr>
				<td><%=s.getId()%></td>
				<td><%=s.getNome()%></td>
				<td><%=s.getValor()%></td>
			</tr>	
	<%}%>
	</tbody>

</table>

</body>
</html>