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

<%
	//Coletou o ID do serviço
	int idServico = Integer.parseInt( request.getParameter("id") );
	
	// Localizou o Serviço representado pelo ID
	Servico servico = DaoServico.localizarServicoPorCodigo( idServico );
%>

<form action="editServico.jsp">
	<input name="id" type="hidden" value="<%=servico.getId()%>"/>
	<label> Serviço: </label> <input name="tx_nome" type="text" value="<%=servico.getNome()%>"/> <br/>
	<label> Valor: </label> <input name="tx_valor" type="text" value="<%=servico.getValor()%>"/> <br/>
	
	<button type="submit"> Salvar </button>
</form>


</body>
</html>