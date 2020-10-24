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
	// 1. Coletar
	String nome = request.getParameter("tx_nome");
	double valor = 0;
	
	try{
		valor = Double.parseDouble( request.getParameter("tx_valor") );
	}catch(Exception e){
		
	}
	
	// 2. Construir
	Servico servico = new Servico(nome, valor);
	
	// 3. Manipular
	new DaoServico().inserirServico(servico);
	
	response.sendRedirect("listarServico.jsp");
%>

</body>
</html>