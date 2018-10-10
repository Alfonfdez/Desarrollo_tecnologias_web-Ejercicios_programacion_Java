<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Consulta</title>
		
		<style>
			
			table, th, td {
			border: 1px solid black;
			}
		
		</style>
		
	</head>
	
	<body>
		<h1>Consulta</h1>
		<br/>
		<form action="Controlador">
			<p>Consultar la lista:</p>
			<input type="hidden" name="action" value="consulta">
			<button type="submit">ENVIAR</button>
		</form>
		<br/>
		<table>
		
			<tr>
				<td>ID</td>
				<td>NOMBRE</td>		
			</tr>
			
			<c:forEach var="invitado" items="${invitados}">	
			<tr>
				<td><c:out value="${invitado.id}"></c:out></td>
				<td><c:out value="${invitado.nombre}"></c:out></td>		
			</tr>
			</c:forEach>
			
		</table>
		<br/>
		<a href="index.jsp">Volver a inicio</a>
		
	</body>

</html>