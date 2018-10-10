<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Foros - Página2</title>
	</head>
	
	<body>
		<h1>Usuario logueado: ${usuario_nombre}</h1>
		<br>
		<a href="/MVC-06-Foro/Controlador?action=ver_hilos">Ver hilos</a>
		<br>
		<a href="/MVC-06-Foro/Controlador?action=crear_hilo">Crear Hilo</a>
		<br>
		<a href="index.jsp">Volver atrás</a>
	</body>
	
</html>