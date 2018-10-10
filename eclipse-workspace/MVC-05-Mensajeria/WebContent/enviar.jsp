<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Mensajería - Enviar</title>
		<style>
			
			table, tr, td{
				border: 1px solid black;
			}
		
		</style>
	</head>
	
	<body>
	
		<h1>Enviar mensajes</h1>
		<br>
	
		<form action="Controlador">
		
			<table>
				
				<tr>
					<td>Nombre</td>
					<td>Mandar mensaje</td>
				</tr>
				
				<c:forEach var="usuario" items="${usuarios}">
					<tr>
						<td><c:out value="${usuario.nombre}"></c:out></td>
						<td><input type="checkbox" value="${usuario.id}" name="usuarios[]" value="1"></td>
					</tr>
				</c:forEach>
				
			</table>
			<textarea name="comentarios" cols="30" rows="10"></textarea>
			<br>
			<input type="hidden" name="id_usuario" value="${usuario.id}">
			<input type="hidden" name="action" value="mensaje_enviar">
			<input type="submit" value="enviar">
	
		</form>
	
		<a href="pagina2.jsp">Volver atrás</a>
		
	</body>
	
</html>