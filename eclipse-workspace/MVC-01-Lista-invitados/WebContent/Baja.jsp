<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<h1>Baja</h1>
		<br/>
		<form action="Controlador">
			<p>Introduzca el id:</p>
			<input type="text" name="nombre">
			<input type="hidden" name="action" value="baja">
			<button type="submit">ENVIAR</button>
		</form>
		<br/>
		<a href="index.jsp">Volver a inicio</a>
	</body>
</html>