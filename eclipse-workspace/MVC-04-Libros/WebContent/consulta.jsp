<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Consulta libros</title>
		
		<style>
			table, tr, td {
				border: 1px solid black;
			}
			
			#thead{
				background: yellow;
				font-style: bold;
			}
			
			#tfooter{
				
			}
			
			#gris{
				background: grey;
			}
			
		</style>
	</head>
	
	<body>
	
		<form action="Controlador" id="formulario">
		
			<table>
			
				<!-- TÍTULOS SUPERIORES DE LA TABLA -->
				<tr id="thead">
					<td>ID</td>
					<td>TÍTULO</td>
					<td>PRECIO</td>
					<td>OPCIÓN</td>
				</tr>
				
				<!-- LISTADO DE LIBROS -->
				<c:forEach var="libro" items="${libros}">
				<tr>
					<td><c:out value="${libro.id}"></c:out></td>
					<td><input type="text" name="titulo" id="titulo${libro.id}" value="<c:out value="${libro.titulo}"></c:out>"></td>
					<td><input type="text" name="precio" id="precio${libro.id}" value="<c:out value="${libro.precio}"></c:out>"></td>
					
					<td>
						<input type="button" onclick="baja(${libro.id})" value="baja">
						<input type="button" onclick="modificar(${libro.id})" value="modificar"></td>
				</tr>
				</c:forEach>
				
				<!-- FOOTER DE LA TABLA -->
				<tr id="tfooter">
					<td id="gris"></td>
					<td><input type="text" name="titulo2"></td>
					<td><input type="text" name="precio2"></td>
					<td><input type="hidden" name="action" value="alta2" id="action">
						<input type="submit" value="agregar"></td>
				</tr>
				
			</table>
			
			<!-- Recoge el ID -->
			<input type="hidden" name="id" value="${libro.id}" id="idEnviada">
			
			<!-- Recoge EL TÍTULO Y EL PRECIO CONCRETO DEL LIBRO PULSADO -->
			<input type="hidden" name="titulo_modificado" id="titulo_modificado">
			<input type="hidden" name="precio_modificado" id="precio_modificado">
			
		</form>
		
		<br>
		<a href="index.html">Volver</a>
		
		<script>
		
			function baja(id){
				
				document.getElementById("action").value="baja";
				
				document.getElementById("idEnviada").value = id;
				
				document.getElementById("formulario").submit();
			}
			
			function modificar(id){
				
				document.getElementById("action").value="modificar";
				
				document.getElementById("idEnviada").value = id;	
				document.getElementById("titulo_modificado").value = document.getElementById("titulo"+id).value;	
				document.getElementById("precio_modificado").value = document.getElementById("precio"+id).value;
				
				document.getElementById("formulario").submit();
				
			}
				
		</script>
	</body>
</html>