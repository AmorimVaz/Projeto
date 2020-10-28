<%@page import="org.hibernate.exception.ConstraintViolationException"%>
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
	// Coletou o ID do serviço
	int idServico = Integer.parseInt( request.getParameter("id") );
	
	// Localizou o Serviço representado pelo ID
	Servico servico = DaoServico.localizarServicoPorCodigo( idServico );
	
	// Removeu o Serviço do BD
	try{
		DaoServico.removerServico( servico );
		
		// Voltar para a listagem
		response.sendRedirect("listarServico.jsp");
	}catch(ConstraintViolationException fk){
		out.println("Serviço não pode ser removido, verifique se já está em uso!");
	}catch(Exception e){
		out.print(e.getMessage());
	}
%>

</body>
</html>