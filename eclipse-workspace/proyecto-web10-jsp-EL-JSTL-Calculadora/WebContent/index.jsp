<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/proyecto-web10-jsp-EL-JSTL-Calculadora/Controlador">
	
		<input type="text" name="num1"></input>
		
		<select name="operacion">	
			<option value="suma">+</option>
			<option value="resta">-</option>
			<option value="multiplicacion">*</option>
			<option value="division">/</option>
		</select>
		<input type="text" name="num2"></input>
	
		<input type="submit" value="calcular">
	
	</form>		

</body>
</html>