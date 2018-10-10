<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="/proyecto-web08-jsp-EL-JSTL-Caja/Controlador"> <!-- enlaza con el 'servlet' -->
		
			<p>Nombre del cliente:</p>
			<input type="text" name="nombre"></input>
			
			<p>Material de la caja:</p>		
			<select name="material">	
				<option value="plastico" >plástico</option>
				<option value="madera" >madera</option>
			</select>
			
			<input type="radio" name="tamano" value="pequeno" checked>Pequeño</input>
  			<input type="radio" name="tamano" value="mediano">Mediano</input>
  			<input type="radio" name="tamano" value="grande">Grande</input>
  			
			<p>Comentarios:</p>		
			<textarea name="comentario" rows="10" cols="30"></textarea>

			<input type="submit" value="Enviar">Enviar</input>
		
		</form>
</body>
</html>