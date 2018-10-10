<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Librería Struts 2 - Consulta</title>
		
		<style>
		
			body {
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #FFBE05;
				font-size: 2em;
				
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
	
		<h1>CONSULTA</h1>
		<br>
		<br>
		<table>
		
			<tr>
				<th>ID</th>
				<th>TÍTULO</th>
				<th>PRECIO</th>
			</tr>
			
			<s:iterator value="libros">
				<tr>
					<td><a href="consultaLibro.action?libro.id=<s:property value="id" />"><s:property value="id" /></a></td>
					<td><s:property value="titulo" /></td>
					<td><s:property value="precio" /></td>
				</tr>
			</s:iterator>
			
		</table>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
			
	</body>
	
</html>