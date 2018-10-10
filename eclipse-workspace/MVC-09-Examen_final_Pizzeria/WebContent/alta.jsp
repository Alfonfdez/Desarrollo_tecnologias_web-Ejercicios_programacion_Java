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
		
		</style>
		
	</head>
	
	<body>
	
		<h1>ALTA</h1>
		<br>
		<br>
		<form action="Controlador">	
		
			<p>Tipo</p><select name="tipo">	
				<option value="Margarita" >Margarita</option>
				<option value="Vegetal" >Vegetal</option>
				<option value="Carbonara" >Carbonara</option>
				<option value="Barbacoa" >Barbacoa</option>
			</select>
			<p>Size</p><select name="size">	
				<option value="Pequena" >Pequena</option>
				<option value="Mediana" >Mediana</option>
				<option value="Grande" >Grande</option>
			</select>
			<p>Codigo promocional</p><input type="text" name="codigo">
			<p>Entrega</p><select name="entrega">	
				<option value="Si" >Si</option>
				<option value="No" >No</option>
			</select>
			<br>
			<br>
			<input type="hidden" name="action" value="alta">
			<input type="submit" value="Enviar consulta">
			
		</form>
		<br>
		El precio es: <input type="text" value="${costePedido.costeTotal}">
		<br>
		<a href="index.jsp">Volver al inicio</a>
		
	</body>
	
</html>