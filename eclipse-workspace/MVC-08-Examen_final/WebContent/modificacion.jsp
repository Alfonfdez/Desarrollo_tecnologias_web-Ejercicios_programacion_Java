<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->  
    
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
		<form action="Controlador" id="formulario">
		
			<p>Noches</p><input type="text" name="noches" value="${viaje.noches}">
			<p>Destino</p><select name="destino">
				<option value="${viaje.destino}" >${viaje.destino}</option>
				<option value="oviedo" >oviedo</option>
				<option value="tokyo" >tokyo</option>
				<option value="madrid" >madrid</option>
				<option value="barcelona" >barcelona</option>
			</select>
			
			<input type="hidden" name="id_viaje" value="${viaje.id}">
			
			<input type="hidden" name="action" value="modificacion" id="action">
			<input type="submit" value="Actualizar">
			<input type="button" value="Eliminar" onclick="cambiarAction()">
			
		</form>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
		
		<script>
			
			function cambiarAction(){
				document.getElementById("action").value="eliminacion";
		        document.getElementById("formulario").submit();
			}
		
		</script>
		
	</body>
	
</html>