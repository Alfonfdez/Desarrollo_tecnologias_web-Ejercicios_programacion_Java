<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Mensajería - Mensajes</title>
		<style>
		
			table, tr, td{
			
				border: 1px solid black;
				
			}
			
		</style>
	</head>
	
	<body>
	
		<h1>Ver mensajes</h1>
		<br>
		<table>
			<tr>
				<td colspan="4">MENSAJES</td>
			</tr>			
			<tr>
				<td>ID</td>
				<td>REMITENTE</td>
				<td>DESTINATARIO</td>
				<td>MENSAJES</td>
			</tr>
			<c:forEach var="mensaje" items="${mensajes}">
				<tr>
					<td><c:out value="${mensaje.id}"></c:out></td>
					<td><c:out value="${mensaje.remitente.nombre}"></c:out></td>
					<td><c:out value="${mensaje.destinatarios.nombre}"></c:out></td>
					<td><c:out value="${mensaje.texto}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<a href="pagina2.jsp">Volver atrás</a>
	
	</body>
	
</html>