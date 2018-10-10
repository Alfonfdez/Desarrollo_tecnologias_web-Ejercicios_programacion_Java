<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
		<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
		<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
		
	</head>
<body>

		<form action="/proyecto-web05-jsp-scriplet-EL-JSTL/Controlador"> <!-- enlaza con el 'servlet' -->
		
			<input type="text" name="nombre">
			
			<input type="submit" value="Saludar">
		
		</form>
		
		<h1>Scriplet JSP</h1>
		Hola <%=request.getParameter("nombre")%>
		
		<h1>EL - Expression Language</h1>
		${resultado}
			
		<h1>JSTL</h1>	
		<c:out value="${resultado}" />

</body>
</html>