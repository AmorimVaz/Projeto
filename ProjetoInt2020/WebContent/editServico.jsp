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
	String nome = request.getParameter("tx_nome");
	double valor = Double.parseDouble( request.getParameter("tx_valor") );
	
	// Localizou o Serviço representado pelo ID
	Servico servico = DaoServico.localizarServicoPorCodigo( idServico );
	servico.setNome(nome);
	servico.setValor(valor);
	
	DaoServico.editarServico(servico);
	
	// Voltar para a listagem
	response.sendRedirect("listarServico.jsp");
%>

</body>
</html>