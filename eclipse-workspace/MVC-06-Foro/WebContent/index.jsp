<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Foro</title>
	</head>
	
	<body>
	
		<h1>FORO</h1>
		<br>
		<h2>Login</h2>
		<br>
		
		<form action="Controlador">
		
			<input type="text" name="nombre">
			<br>
			<input type="text" name="pass">
			<br>		
			<input type="hidden" name="action" value="login">
			<input type="submit" value="login">		
				
		</form>
		
		<br>
		<br>
		<h1>CRUD</h1>
		<br>
		<h2>Alta</h2>
		<br>
		
		<form action="Controlador">
			
			<input type="text" name="nombre">
			<br>
			<input type="text" name="pass">
			<br>
			<input type="hidden" name="action" value="alta">
			<input type="submit" value="enviar">
			
		</form>
		
		<br>	
		<h2>Consulta y Baja</h2>
		<br>
		<a href="/MVC-06-Foro/Controlador?action=consulta">Consulta de usuarios</a>		

	</body>
	
</html>