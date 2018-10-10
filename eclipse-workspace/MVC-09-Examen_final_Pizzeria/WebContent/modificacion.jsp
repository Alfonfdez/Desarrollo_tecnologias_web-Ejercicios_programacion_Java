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
	
		<h1>MODIFICACIÓN</h1>
		<br>
		<br>
		<form action="Controlador" id="formulario">
		
			<p>Tipo</p><select name="tipo">
				<option value="${pedido.tipo}" >${pedido.tipo}</option>
				<option value="Margarita" >Margarita</option>
				<option value="Vegetal" >Vegetal</option>
				<option value="Carbonara" >Carbonara</option>
				<option value="Barbacoa" >Barbacoa</option>
			</select>
			<p>Size</p><select name="size">
				<option value="${pedido.size}" >${pedido.size}</option>
				<option value="Pequena" >Pequena</option>
				<option value="Mediana" >Mediana</option>
				<option value="Grande" >Grande</option>
			</select>
			<p>Codigo promocional</p><input type="text" name="codigo" value="${pedido.codigo}">
			<p>Entrega</p><select name="entrega">
				<option value="${pedido.entrega}" >${pedido.entrega}</option>
				<option value="Si" >Si</option>
				<option value="No" >No</option>
			</select>
			
			
			<input type="hidden" name="id_pedido" value="${pedido.id}">
			
			<input type="hidden" name="action" value="modificacion" id="action">
			<input type="submit" value="Actualizar">
			<input type="button" value="Eliminar" onclick="cambiarAction()">
					
		</form>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
		
		<script>
			
			function cambiarAction(){
				document.getElementById("action").value="eliminacion";
		        document.getElementById("formulario").submit();
			}
		
		</script>
		
	</body>
	
</html>