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

		<h1>EL</h1>		
		<p>Mensaje montado: El/la señor/señora ${mensaje.nombre}, ha solicitado comprar una caja de tamaño ${mensaje.tamano} y material ${mensaje.material}. ${mensaje.comentario}</p>
		
		<h1>JSTL</h1>
		<p>Mensaje montado: El/la señor/señora <c:out value="${mensaje.nombre}" />, ha solicitado comprar una caja de tamaño <c:out value="${mensaje.tamano}" /> y material <c:out value="${mensaje.material}" />. <c:out value="${mensaje.comentario}" /></p>
		
</body>
</html>