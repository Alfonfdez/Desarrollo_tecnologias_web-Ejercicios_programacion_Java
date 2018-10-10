<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Alta libros</title>
	</head>
	
	<body>
		<form action="Controlador">
			<input type="text" name="titulo">Introduzca el título del libro
			<br>
			<input type="text" name="precio">Introduzca el precio del libro
			<br>
			<input type="hidden" name="action" value="alta">
			<input type="submit" value="enviar">
		</form>
		<br>
		<a href="index.html">Volver</a>
	</body>
</html>