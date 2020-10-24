<%@page import="projeto.barbearia.colecao.DaoProfissional"%>
<%@page import="projeto.barbearia.modelo.Profissional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3> Listagem de Profissionais </h3>
<hr/>

<table border="1">
	<thead>
		<tr>
			<th>Código</th>
			<th>Nome</th>
			<th>Nota</th>
			<th>Serviço</th>
		</tr>
	</thead>
	
	<tbody>
		<%for(Profissional p : DaoProfissional.listarProfissional()){
			out.println("<tr>");
				out.println("<td>"+ p.getCodigo() +"</td>");
				out.println("<td>"+ p.getNome() +"</td>");
				out.println("<td>"+ p.getNota() +"</td>");
				out.println("<td>"+ p.getServico().getNome() +"</td>");
			out.println("</tr>");
		}%>
	</tbody>
	
</table>

</body>
</html>