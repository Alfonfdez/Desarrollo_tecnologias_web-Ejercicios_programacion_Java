<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pizzería</title>
		
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
			
			<s:iterator value="pedidos">	
			<tr>
				<td><a href="consultaPedido.action?pedido.id=<s:property value="id" />"><s:property value="id" /></a></td>
				<td><s:property value="tipo" /></td>
				<td><s:property value="size" /></td>
				<td><s:property value="codigo" /></td>
				<td><s:property value="entrega" /></td>
			</tr>
			</s:iterator>

		</table>
		<br>
		<br>
		<a href="index.jsp">Volver al menú principal</a>
	</body>
	
</html>