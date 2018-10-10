<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Mensajería</title>
		
		<style>
		
			.capa1{
				background: yellow;
			}
			
			.capa2{
				background: grey;
			}
		
		
		</style>
		
	</head>
	
	<body>
	
		<div class="capa1">
			<h1>Login Mensajería</h1>
			<br>
			<form action="Controlador">
				Nombre:<input type="text" name="nombre">
				Password:<input type="text" name="pass">
				<br>
				<input type="hidden" name="action" value="login">
				<input type="submit" value="login">		
			</form>
		</div>
		<br>
		<br>
		<br>
		<div class="capa2">
			<h1>CRUD Mensajería</h1>
			<br>
			<h2>ALTA</h2>
			<br>
			<form action="Controlador">
				Nombre:<input type="text" name="nombre_nuevo">
				Password:<input type="text" name="pass_nuevo">
				<br>
				<input type="hidden" name="action" value="alta">
				<input type="submit" value="enviar">		
			</form>
			<br>
			<h2>CONSULTA Y BAJA</h2>
			<br>
			<a href="/MVC-05-Mensajeria/Controlador?action=consulta">Consulta de usuarios</a>
		</div>
		
	</body>
	
</html>