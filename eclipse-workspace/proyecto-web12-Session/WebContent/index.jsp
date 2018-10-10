<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

	<form action="/proyecto-web12-Session/Controlador">
	
		<input type="text" name="num1">Número 1
		<input type="text" name="num2">Número 2
	
		<input type="submit" value="Suma">
		</br>		
		</br>
		<input type="text" value="<c:out value="${suma1_request}"/>">Suma de request
		</br>
		</br>
		<input type="text" value="<c:out value="${suma2_sesion}"/>">Suma de sesión
		</br>
		</br>
		<input type="text" value="<c:out value="${suma3_contexto}"/>">Suma de contexto
	
	</form>

</body>
</html>