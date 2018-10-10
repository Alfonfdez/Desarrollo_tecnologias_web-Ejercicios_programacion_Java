<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->   
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Tienda de malabares - Modificación</title>
		
		<style>
		
			body{
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #A5FF84;
			}
		
		</style>
	
	<body>
		<h1>Modificación</h1>
		<br>
		<br>
		<form action="Controlador" id="formulario">
			<p>Nombre</p><input type="text" name="nombre" value="${malabar.nombre}">
			<br>
			<p>Descripción</p><input type="text" name="descripcion" value="${malabar.descripcion}">
			<br>
			<p>Marca</p><input type="text" name="marca" value="${malabar.marca}">
			<br>	
			<p>Stock</p><input type="text" name="stock" value="${malabar.stock}">
			<br>
			<input type="hidden" name="id_malabar" value="${malabar.id}">
			<input type="hidden" name="action" value="modificacion" id="action"> <!-- Gracias a este 'input' escondido podremos descifrar en el Controlador que queremos realizar una Modificación -->
			<input type="submit" value="Actualizar">
			<input type="button" value="Eliminar" onclick="cambiarAction()">
		</form>
		<br>
		<br>
		<a href="index.jsp">Volver al menú principal</a>
		
		<script>
			
			function cambiarAction(){
				document.getElementById("action").value="eliminacion";
		        document.getElementById("formulario").submit();
			}
		
		</script>
		
	</body>

</html>