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
	/*String tipo = "Aluno";
	
	if(tipo.equals("Aluno") || tipo.equals("Professor")){
		out.println("<a href=\"entrar.html\"> Entrar </a>");
	}else{
		out.println("<a href='sair.html'> Sair </a>");
	}*/
	
	
	String btnLogin = "Maisa";
	String btnLoginAction = "entrar.html";
	
	String tipo = "Aluno";
	if(tipo.equalsIgnoreCase("aluno") ){
		btnLogin = "Sair";
		btnLoginAction = "sair.html";
	}else{
		btnLogin = "Entrar";
		btnLoginAction = "entrar.html";
	}
%>

<a href='<%=btnLoginAction%>'> <%=btnLogin%> </a>

<form action="<%=btnLoginAction%>">
	<button> <%=btnLogin %> </button>
</form>



</body>
</html>