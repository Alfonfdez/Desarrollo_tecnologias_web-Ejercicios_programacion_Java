<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>

	body{
	background-color:${color};
	}
	
	/*body{
	background-color:<c:out value="${color}" />;
	}*/
	
	
</style>

</head>

<body>

	<!--  <script>
	document.body.style.backgroundColor = "${color}";
	</script>-->
	
	<!--  <script>
	document.body.style.backgroundColor = "<c:out value="${color}" />";
	</script>-->


</body>
</html>