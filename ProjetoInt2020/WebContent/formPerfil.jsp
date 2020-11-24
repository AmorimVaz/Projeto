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

<form action="addPerfil.jsp" method="get">
	Usuário: <input type="text" name="tx_usuario"/> <br/>
	Senha:	<input type="password" name="tx_senha"/> <br/>
	
	Profissional:
	<select name="id_Profissional">
		<%for( Profissional s : DaoProfissional.listarProfissional() ){%>
			<option value="<%=s.getCodigo()%>"> <%=s.getNome()%> </option>
		<%}%>
	</select> <br/>

	<input type="submit" value="Enviar (input)">
</form>

</body>
</html>