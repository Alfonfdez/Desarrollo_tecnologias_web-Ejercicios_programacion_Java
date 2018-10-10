<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->

   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Tienda de malabares</title>
		
		<style>
		
			body{
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #A5FF84;
				font-size: 2em;
			}
			
			table, tr, th, td {
				border: 1px solid black;
			}
			
			img {
				width: 10%;	
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
				<th>Nombre</th>
				<th>Descripción</th>
				<th>Stock</th>
			</tr>
			
			<s:iterator value="malabares">	
			<tr>
				<td><a href="consultaMalabar.action?malabar.id=<s:property value="id" />"><img src="imagenes/<s:property value="marca" />.png"></a></td>
				<td><s:property value="nombre" /></td>
				<td><s:property value="descripcion" /></td>
				<td><s:property value="stock" /></td>
				
			</tr>
			</s:iterator>

		</table>
		<br>
		<br>
		<a href="index.jsp">Volver al menú principal</a>
	</body>
	
</html>