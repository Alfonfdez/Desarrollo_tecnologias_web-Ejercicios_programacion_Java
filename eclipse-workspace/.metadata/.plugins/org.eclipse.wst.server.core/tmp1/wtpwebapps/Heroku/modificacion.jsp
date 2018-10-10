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
		
		</style>
		
	</head>
	
	<body>
	
		<h1>MODIFICACIÓN</h1>
		<br>
		<br>
		<s:form >
		
			<s:select list="#{'Margarita':'Margarita', 'Vegetal':'Vegetal','Carbonara':'Carbonara','Barbacoa':'Barbacoa'}" name="pedido.tipo" label="Tipo" value="%{pedido.tipo}"/>
			<s:select list="#{'Pequena':'Pequena', 'Mediana':'Mediana','Grande':'Grande'}" name="pedido.size" label="Tamaño" value="%{pedido.size}"/>
			<s:textfield name="pedido.codigo" label="Código promocional" value="%{pedido.codigo}" />	
			<s:select list="#{'Si':'Si', 'No':'No'}" name="pedido.entrega" label="Entrega" value="%{pedido.entrega}"/>
			
			<s:hidden name="pedido.id" value="%{pedido.id}"/>
			
			<s:submit action="modificacion" value="modificar" />
			<s:submit action="baja" value="borrar" />
			
		</s:form>
		<br>
		<br>
		<a href="index.jsp">Volver al inicio</a>
		
	</body>
	
</html>