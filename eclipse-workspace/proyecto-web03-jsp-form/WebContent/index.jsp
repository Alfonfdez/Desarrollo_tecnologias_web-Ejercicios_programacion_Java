<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		
	</head>
	
	<body>
	
		<form action="/proyecto-web03-jsp-form/Controlador"> <!-- enlaza con el 'servlet' -->
		
			<input type="text" name="nombre">
			
			<select name="caracteristica">
				
				<option value="alto" >Alto</option>
				<option value="bajo" >Bajo</option>
				<option value="mediano" >Mediano</option>
			
			</select>
			
			<input type="submit" value="¿Cómo soy?">
		
		</form>
		
		${resultado}
	
	
	</body>

</html>