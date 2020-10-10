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
	// in_codigo | tx_nome | in_nota
	int codigo = Integer.parseInt( request.getParameter("in_codigo") ); 		// "2" -> 2 (int)
	String nome = request.getParameter("tx_nome");
	double nota = Double.parseDouble( request.getParameter("in_nota") );	// "3" -> 3 (double)

	out.println("<h3>" + nome + "</h3>" );
%>

<h2><%=nome%></h2>

</body>
</html>