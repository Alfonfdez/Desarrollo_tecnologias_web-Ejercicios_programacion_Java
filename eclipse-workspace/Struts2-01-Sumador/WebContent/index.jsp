<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Sumador</title>
	</head>
	
	<body>
	
		<s:form action="Sumador">				
			<s:textfield label="Introduzca el n�mero 1" name="n1" />
			<s:textfield label="Introduzca el n�mero 2" name="n2" />
			<s:submit/>
		</s:form>
	
	
	</body>
	
</html>