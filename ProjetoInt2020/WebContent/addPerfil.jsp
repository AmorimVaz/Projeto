<%@page import="projeto.barbearia.colecao.DaoPerfil"%>
<%@page import="projeto.barbearia.colecao.DaoProfissional"%>
<%@page import="projeto.barbearia.modelo.Perfil"%>
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

<%
	String usuario = request.getParameter("tx_usuario");
	String senha = request.getParameter("tx_senha");
	int idProfissional = Integer.parseInt(request.getParameter("id_Profissional"));

	Profissional prof = DaoProfissional.localizarProfissionalPorCodigo(idProfissional);
	
	Perfil perfil = new Perfil(usuario, senha, prof);
	
	DaoPerfil.inserirPerfil( perfil );
	
	response.sendRedirect("FormLogin.jsp");
%>

</body>
</html>
