<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> <!-- FORMATO DE FECHAS -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Modificación</title>
	</head>
	
	<body>
		<h1>Modificación</h1>
		<br>
		<form action="Controlador" id="formulario">
			Introduzca el nuevo nombre: <input type="text" name="nombre" value="${paciente.nombre}">
			<br>
			<br>
			Introduzca el nuevo apellido: <input type="text" name="apellido" value="${paciente.apellido}">
			<br>
			<br>
			Introduzca la nueva fecha de alta (dd-MM-yyyy): <input type="text" name="fecha" value="<fmt:formatDate pattern="dd-MM-yyyy" value="${paciente.fecha}" />" >
			<br>
			<br>
			<input type="hidden" name="id_paciente" value="${paciente.id}">
			<input type="hidden" name="action" value="modificacion" id="action"> <!-- Gracias a este 'input' escondido podremos descifrar en el Controlador que queremos realizar una Modificación -->
			<input type="submit" value="modificar">
			<br>
			<input type="button" value="borrar" onclick="cambiarAction()">
		</form>
		<br>
		<br>
		<a href="/MVC-03-Hospital/Controlador?action=consulta">Volver a la consulta</a>
		
		<script>
			
			function cambiarAction(){
				document.getElementById("action").value="borrar";
		        document.getElementById("formulario").submit();
			}
		
		</script>
	</body>
	
</html>