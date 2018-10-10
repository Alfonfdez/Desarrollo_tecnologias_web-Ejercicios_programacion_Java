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
		
		</style>
		
	</head>
	
	<body>
	
		<h1>MODIFICACIÓN</h1>
		<br>
		<br>
		<s:form >
		
			<s:textfield name="malabar.nombre" label="nombre" value="%{malabar.nombre}" />
			<s:textfield name="malabar.descripcion" label="descripcion" value="%{malabar.descripcion}" />
			<s:textfield name="malabar.stock" label="stock" value="%{malabar.stock}" />
			<s:select list="#{'nike':'nike', 'adidas':'adidas','reebok':'reebok'}" name="malabar.marca" label="marca" value="%{malabar.marca}"/>
			
			<s:hidden name="malabar.id" value="%{malabar.id}"/>
			
			<s:submit action="modificacion" value="modificar" />
			<s:submit action="baja" value="borrar" />
			
		</s:form>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
		
	</body>
	
</html>