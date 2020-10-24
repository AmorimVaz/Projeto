<%@page import="projeto.barbearia.colecao.DaoServico"%>
<%@page import="projeto.barbearia.modelo.Servico"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addProfissional.jsp" method="get">
	Nome: 	<input type="text" name="tx_nome"/> <br/>
	Nota:	<input type="number" name="in_nota"/> <br/>
	
	Serviço:
	<select name="nm_servico">
		<%for( Servico s : DaoServico.listarServico() ){%>
			<option value="<%=s.getId()%>"> <%=s.getNome()%> </option>
		<%}%>
	</select> <br/>

	<input type="submit" value="Enviar (input)">
</form>

<a href="addProfissional.jsp?tx_nome=Maisa&in_nota=5&nm_servico=1"> Exemplo </a>

</body>
</html>