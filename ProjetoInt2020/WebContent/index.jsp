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

<a href="logout.jsp"> Sair </a> </br>
<%
	Perfil perfil = (Perfil) session.getAttribute("logado");
	if(perfil == null)
		response.sendRedirect("FormLogin.jsp");
%>

<h3> Olá <%=perfil.getProfissional().getNome()%> </h3>

</body>
</html>