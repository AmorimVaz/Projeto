<%@page import="projeto.barbearia.colecao.DaoPerfil"%>
<%@page import="projeto.barbearia.modelo.Perfil"%>
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

	Perfil perfilDB = DaoPerfil.localizarPerfilPorUsuario( usuario );
	
	if( perfilDB != null ){
		if( perfilDB.getSenha().equals( senha )){
			session.setAttribute("logado", perfilDB);
			response.sendRedirect("index.jsp");
		}else
			response.sendRedirect("FormLogin.jsp");
	}else
		response.sendRedirect("FormLogin.jsp");
%>

</body>
</html>