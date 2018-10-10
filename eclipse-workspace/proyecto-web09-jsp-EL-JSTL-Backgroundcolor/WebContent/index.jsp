<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="/proyecto-web09-jsp-EL-JSTL-Backgroundcolor/Controlador"> <!-- enlaza con el 'servlet' -->
					
			<p>Escoge un color:</p>		
			<select name="color">	
				<option value="red">rojo</option>
				<option value="green">verde</option>
				<option value="blue">azul</option>
			</select>
			
			<input type="submit" value="Enviar">
			
		</form>
		


</body>
</html>