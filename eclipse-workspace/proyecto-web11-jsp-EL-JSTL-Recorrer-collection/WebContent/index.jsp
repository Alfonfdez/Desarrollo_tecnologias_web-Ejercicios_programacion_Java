<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		
		<style>
			
			table, th, td {
			border: 1px solid black;
			}
		
		</style>
</head>
<body>

	
		<table>
			<tr>
				<td>DNI</td>
				<td>NOMBRE</td>
				<td>DIRECCIÓN</td>			
			</tr>
			
			
			<!-- Metemos aquí la iteración 'c:forEach' para que repita esta <tr> -->	
			
			<c:forEach var="persona" items="${personas}">
			
			<tr>
				<td><c:out value="${persona.dni}"></c:out></td>
				<td><c:out value="${persona.nombre}"></c:out></td>
				<td><c:out value="${persona.direccion}"></c:out></td>			
			</tr>
			
			</c:forEach>
			
		</table>
	
	<!---->	
	
</body>
</html>