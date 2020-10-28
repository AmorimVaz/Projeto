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
			<th>Ações</th>
		</tr>
	</thead>
	
	<tbody>
	<%for( Servico s : DaoServico.listarServico()){%>
			<tr>
				<td><%=s.getId()%></td>
				<td><%=s.getNome()%></td>
				<td><%=s.getValor()%></td>
				<td> 
					<a href="delServico.jsp?id=<%=s.getId()%>"> Excluir </a> |
					<a href="editFormServico.jsp?id=<%=s.getId()%>"> Editar </a> 
				</td>
			</tr>	
	<%}%>
	</tbody>

</table>

</body>
</html>