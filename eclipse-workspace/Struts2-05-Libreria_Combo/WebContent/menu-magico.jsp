<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Librería Struts 2 - Menú-mágico</title>
		
		<style>
		
			body {
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #FFBE05;
				font-size: 2em;
				
			}
		
		</style>
		
	</head>
	
	<body>
	
		<h1>MENÚ-MÁGICO</h1>
		<br>
		<br>
		<s:select name="libro.id" list="libros" headerKey="0" headerValue="Selecciona una opción" listKey="id" listValue="titulo" />
		<!-- "listKey: selecciona por id" -->
		<!-- "listValue: selecciona los títulos de los libros" -->
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
		
	</body>
	
</html>