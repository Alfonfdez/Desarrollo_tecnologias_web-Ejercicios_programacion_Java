<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="/proyecto-web04-jsp-calculadora/Controlador"> <!-- enlaza con el 'servlet' -->
		
			<input type="text" name="numero1">
			<input type="text" name="numero2">
			
			<select name="operacion">
				
				<option value="suma" >+</option>
				<option value="resta" >-</option>
				<option value="multiplicacion" >*</option>
				<option value="division" >/</option>
			
			</select>
			
			<input type="submit" value="Realizar operación">
		
		</form>
		
		${resultado}
</body>
</html>