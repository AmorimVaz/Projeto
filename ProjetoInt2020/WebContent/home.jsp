<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		String pageName = request.getParameter("pageName");
		if(pageName==null)
			pageName="formPerfil.jsp";
	%>

    <header>
        <!-- Top -->
        <jsp:include page="_menu.jsp"/>
    </header>

    <section class="container">
        <jsp:include page="<%=pageName%>"></jsp:include>
    </section>

    <footer>
        <!-- Rodapé -->
        <p class="text-center">Desenvolvido pelo 4º Módulo de Informática - 2021</p>
    </footer>

</body>
</html>