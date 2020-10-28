<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
	String dataForm = request.getParameter("exData");

	SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
	Date dataN = formatoData.parse(dataForm);			// String para Date
	
	SimpleDateFormat formatoDataSaida = new SimpleDateFormat("dd/MM/yyyy");
	String result = formatoDataSaida.format(dataN);		// Date para String
	
	//p.setDataNasc( dataN );
%>

</body>
</html>