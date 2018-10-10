<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Ingreso</title>
	</head>
	
	<body>
		<h1>Ingreso</h1>
		<br>
		<form action="Controlador">
			Introduzca el nombre: <input type="text" name="nombre">
			<br>
			<br>
			Introduzca el apellido: <input type="text" name="apellido">
			<br>
			<br>
			Introduzca la fecha de alta (dd-MM-yyyy): <input type="text" name="fecha">
			<br>
			<br>
			<input type="hidden" name="action" value="ingreso"> <!-- Gracias a este 'input' escondido podremos descifrar en el Controlador que queremos realizar un Ingreso  -->
			<input type="submit" value="enviar">
		</form>
		<br>
		<br>
		<a href="index.html">Volver al inicio</a>
	</body>
	
</html>