<%@page import="projeto.barbearia.colecao.DaoProfissional"%>
<%@page import="projeto.barbearia.modelo.Profissional"%>
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
	//int codigo = Integer.parseInt( request.getParameter("in_codigo") ); 		// "2" -> 2 (int)

	// 1. Coletar
	String nome = request.getParameter("tx_nome");
	double nota = Double.parseDouble( request.getParameter("in_nota") );	// "3" -> 3 (double)
	int idServico = Integer.parseInt( request.getParameter("nm_servico") );

	Servico servico = DaoServico.localizarServicoPorCodigo( idServico );
	
	// 2. Construir
	Profissional prof = new Profissional(nome, nota, servico);
	
	// 3. Manipular
	DaoProfissional.salvarProfissional( prof );
	
	response.sendRedirect("listarProfissional.jsp");
	
%>

<h2><%=nome%></h2>

</body>
</html>