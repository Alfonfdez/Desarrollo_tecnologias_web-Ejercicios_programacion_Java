<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Tienda de malabares - Alta</title>
		
		<style>
		
			body{
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #A5FF84;
			}
		
		</style>

	</head>
	
	<body>
	
		<h1>Alta</h1>
		<br>
		<br>
		<form action="Controlador">
			<p>Nombre</p><input type="text" name="nombre">
			<br>
			<p>Descripción</p><textarea name="descripcion" cols="20" rows="10"></textarea>
			<br>
			<p>Marca</p><input type="text" name="marca">
			<br>	
			<p>Stock</p><input type="text" name="stock">
			<br>
			<input type="hidden" name="action" value="alta">
			<input type="submit" value="Dar de alta">		
		</form>
		<br>
		<br>
		<a href="index.jsp">Volver al menú principal</a>
	</body>
	
</html>