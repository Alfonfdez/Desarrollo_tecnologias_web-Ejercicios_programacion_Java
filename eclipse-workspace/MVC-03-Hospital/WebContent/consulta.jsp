<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> <!-- FORMATO DE FECHAS -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Consulta</title>
		
		<style>
			table, tr,td{
				border: 1px solid black;
			}
		</style>
	
	</head>
	
	<body>
		<h1>Consulta</h1>
		<br>
		<table>
			<tr>
				<td>ID</td>
				<td>NOMBRE</td>
				<td>APELLIDO</td>
				<td>FECHA</td>
			</tr>
			
			<c:forEach var="paciente" items="${pacientes}">		
			<tr>
				<td><a href="/MVC-03-Hospital/Controlador?action=consulta_modificacion&id_paciente=${paciente.id}"><c:out value="${paciente.id}"></c:out></a></td>					
				<td><c:out value="${paciente.nombre}"></c:out></td>
				<td><c:out value="${paciente.apellido}"></c:out></td>
				<td><fmt:formatDate pattern="dd-MM-yyyy" value="${paciente.fecha}" /></td>
			</tr>
			</c:forEach>
		</table>
		<br>
		<br>
		<a href="index.html">Volver al inicio</a>
	</body>
	
</html>