<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Mensajería - Consulta</title>
		
		<style>
		
			table, tr, td {
				border: 1px solid black;
			}
		
		</style>
		
	</head>
	
	<body>
	
		<h1>Consulta y baja</h1>
		<br>
	
		<form action="Controlador">
			<table>
				<tr>
					<td>ID</td>
					<td>NOMBRE</td>
					<td>PASS</td>
					<td>ELIMINAR</td>
				</tr>
				<c:forEach var="usuario" items="${usuarios}">
					<tr>
						<td><c:out value="${usuario.id}"></c:out>
						<input type="hidden" name="id_usuario" value="<c:out value="${usuario.id}"></c:out>"></td>
						<td><c:out value="${usuario.nombre}"></c:out></td>
						<td><c:out value="${usuario.pass}"></c:out></td>
						<td><!-- Recoge el ID -->
						<input type="hidden" name="action" value="baja">
						<input type="submit" value="eliminar"></td>
					</tr>
				</c:forEach>		
			</table>
			<br>
		</form>
		
		<a href="index.jsp">Volver atrás</a>
	
	</body>
	
</html>