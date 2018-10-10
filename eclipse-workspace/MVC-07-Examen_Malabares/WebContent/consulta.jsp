<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Tienda de malabares - Consulta</title>
		
		<style>
		
			body{
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #A5FF84;
			}
		
			table, tr, th, td {
				border: 1px solid black;
			}
		
		</style>
		
	</head>
	
	<body>
	
		<h1>Consulta</h1>
		<br>
		<br>
		<table>
		
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Descripción</th>
				<th>Stock</th>
			</tr>
			
			<c:forEach var="malabar" items="${malabares}">	
			<tr>
				<td><a href="/MVC-07-Examen_Malabares/Controlador?action=consulta_modificacion&id_malabar=${malabar.id}"><c:out value="${malabar.id}"></c:out></a></td>
				<td><c:out value="${malabar.nombre}"></c:out></td>
				<td><c:out value="${malabar.descripcion}"></c:out></td>
				<td><c:out value="${malabar.stock}"></c:out></td>
			</tr>
			</c:forEach>

		</table>
		<br>
		<br>
		<a href="index.jsp">Volver al menú principal</a>
	</body>

</html>