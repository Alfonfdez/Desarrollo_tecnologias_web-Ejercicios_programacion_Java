<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<html>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Alta</title>
	</head>
	
	<body>
		<h1>Alta</h1>
		<br/>
		<form action="Controlador">
			<p>Introduzca el nombre:</p>
			<input type="text" name="nombre">
			<input type="hidden" name="action" value="alta">
			<button type="submit">ENVIAR</button>
		</form>
		<br/>
		<a href="index.jsp">Volver a inicio</a>
	</body>
	
</html>