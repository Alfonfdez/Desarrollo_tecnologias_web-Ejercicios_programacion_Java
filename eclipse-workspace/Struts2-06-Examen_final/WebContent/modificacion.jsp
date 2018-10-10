<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Coste Viaje</title>
		
		<style>
		
			body {
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #378818;
				font-size: 2em;
				font-family: arial;
				
			}
		
		</style>
		
	</head>
	
	<body>
	
		<h1>Ejercicio Coste Viaje</h1>
		<br>
		<h2>MODIFICACION</h2>
		<br>
		<br>
		<s:form>
			<s:textfield name="viaje.noches" label="noches" value="%{viaje.noches}" />
			<s:textfield name="viaje.destino" label="destino" value="%{viaje.destino}" />
			
			<s:hidden name="viaje.id" value="%{viaje.id}"/>
			
			<s:submit action="modificacion" value="modificar" />
			<s:submit action="baja" value="borrar" />
			
		</s:form>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
		
	</body>
	
</html>