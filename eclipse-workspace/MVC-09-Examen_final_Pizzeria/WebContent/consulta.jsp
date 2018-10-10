<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL --> 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pizzeria</title>
		
		<style>
		
			body{
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #FF8435;
				font-size: 2em;
			}
		
			table, tr, th, td {
				border: 1px solid black;
			}
			
		</style>
		
	</head>
	
	<body>
	
		<h1>CONSULTA</h1>
		<br>
		<br>
		<table>
		
			<tr>
				<th>id</th>
				<th>tipo</th>
				<th>size</th>
				<th>código promocional</th>
				<th>entrega a domicilio</th>
			</tr>
			
			<c:forEach var="pedido" items="${pedidos}">	
			<tr>
				<td><a href="/MVC-09-Examen_final_Pizzeria/Controlador?action=consulta_modificacion&id_pedido=${pedido.id}"><c:out value="${pedido.id}"></c:out></a></td>
				<td><c:out value="${pedido.tipo}"></c:out></td>
				<td><c:out value="${pedido.size}"></c:out></td>
				<td><c:out value="${pedido.codigo}"></c:out></td>
				<td><c:out value="${pedido.entrega}"></c:out></td>
			</tr>
			</c:forEach>

		</table>
		<br>
		<br>
		<a href="index.jsp">Volver al menú principal</a>
	</body>
	
</html>