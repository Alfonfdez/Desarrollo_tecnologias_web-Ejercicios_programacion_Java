<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Foros - Crear hilos</title>
	</head>
	
	<body>
	
		<h1>Crear hilos</h1>
		<br>
		<form action="Controlador">
		
			<p>Nombre del hilo:</p><input type="text" name="nombre_hilo">
			<br>
			<p>Texto del hilo:</p><textarea name="texto_hilo" cols="30" rows="10"></textarea>
			<br>
			<input type="hidden" name="">
			<input type="submit" value="crear">
			
		</form>
		<br>
		<a href="pagina2.jsp">Volver atrás</a> 
		
	</body>
	
</html>