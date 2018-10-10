<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Librería Struts 2 - Alta</title>
		
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
	
		<h1>ALTA</h1>
		<br>
		<br>
		<s:form action="alta">				
			<s:textfield name="libro.titulo" label="Introduzca el título" />
			<s:textfield name="libro.precio" label="Introduzca el precio" />
			<s:submit />
		</s:form>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
	
	</body>
	
</html>