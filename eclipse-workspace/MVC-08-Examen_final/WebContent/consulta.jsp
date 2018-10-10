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
			
			table, tr, th, td {
			
				border: 1px solid black;
				
			}
			
			th {
			
				background-color: black;
				color: white;
			
			}
		
		</style>
		
	</head>
	
	<body>
	
		<h1>Ejercicio Coste Viaje</h1>
		<br>
		<h2>CONSULTA</h2>
		<br>
		<br>
		<table>
		
			<tr>
				<th>ID</th>
				<th>NOCHES</th>
				<th>DESTINO</th>
			</tr>
			
			<c:forEach var="viaje" items="${viajes}">
				<tr>
					<td><a href="/MVC-08-Examen_final/Controlador?action=consulta_modificacion&id_viaje=${viaje.id}"><c:out value="${viaje.id}"></c:out></a></td>
					<td><c:out value="${viaje.noches}"></c:out></td>
					<td><c:out value="${viaje.destino}"></c:out></td>
				</tr>
			</c:forEach>
			
		</table>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
	
	</body>
	
</html>