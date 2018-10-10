<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%> <!-- Etiqueta Struts -->
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Librería Struts 2</title>
		
		<style>
		
			body {
			
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				background-color: #FFBE05;
				font-size: 2em;
				
			}
		
		</style>
		
	</head>
	
	<body>
	
		<h1>LIBRERÍA</h1>
		<br>
		<br>
		<a href="alta.jsp">Alta</a>
		<!-- ETIQUETAS DE STRUTS 2 ESPECÍFICAS QUE ENLAZARÍAN CON struts.xml ->  <p><a href="<s:url action='alta'/>">Alta</a></p> -->
		<br>
		<a href="consulta.action">Consulta</a>
		<!-- ETIQUETAS DE STRUTS 2 ESPECÍFICAS QUE ENLAZARÍAN CON struts.xml ->  <p><a href="<s:url action='consulta'/>">Consulta</a></p> -->
		<br>
		<a href="carga-combo.action">Carga combo</a>
		
	</body>
	
</html>