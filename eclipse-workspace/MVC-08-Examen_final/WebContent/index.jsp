<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL -->   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Coste Viaje</title>
		
		<style>
		
			body{
				font-family: arial;
			}
		
			h1 {
				text-align: center;
			}
			
			#enunciado{
				background: #FFA03B;
			}
			
			#flexbox{
				display: flex;
				background: #FFA03B;
			}
			
			#solucion {
				display: flex;
				justify-content: space-around;
				background: #49AEFF;
			}
			
			span {
				font-weight: bold;
			}
			
		</style>
		
	</head>
	
	<body>
	
		<h1>Ejercicio Coste Viaje</h1>
		<div id="enunciado">
			<h2>Enunciado</h2>
			<p>A lo largo de este ejercicio, deberemos programar 3 funciones:</p>
			<ul>
				<li>costeHotel()</li>
				<li>costeAvion()</li>
				<li>costeAlquilerCoche()</li>
			</ul>
			<div id="flexbox">
				<div>
					<h3>Coste hotel</h3>
					<p>Ademas del public static void main que te paso mas bajo, crea una funcion llamada costeHotel() que recibe como parametro el numero de noches.</p>
					<p>La funcion debe devolver cuanto es necesario pagar teniendo en cuenta que cada noche cuesta 140 euros.</p>
					<br>
				</div>	
				<div>
					<h3>Coste avion</h3>
					<p>La funcion costeAvion() tiene como parametro de entrada el nombre de la ciudad. El coste correspondera al indicado en la siguiente tabla.</p>
					<p>Los costes por ciudad son los siguientes:</p>
					<ul>
						<li>"Oviedo": 15 euros</li>
						<li>"Tokyo": 700 euros</li>
						<li>"Madrid": 90 euros</li>
						<li>"Barcelona": 90 euros</li>
					</ul>
				</div>	
				<div>
					<h3>Coste alquiler coche</h3>
					<p>La funcion costeAlquilerCoche() tiene como parametro de entrada el numero de noches y devolvera un coste en funcion de dicho parametro, teniendo los siguientes aspectos en cuenta:</p>
					<ul>
						<li>Cada dia de alquiler cuesta 40 euros.</li>
						<li>Si alquilas un coche por 3 dias o mas, obtienes un descuento de 20 euros sobre el total.</li>
						<li>Si alquilas un coche por 7 dias o mas, obtienes un descuento de 50 euros sobre el total (no acumulable con los 20 euros de haber alquilado por mas de 3 dias).</li>
					</ul>
				</div>
			</div>
		</div>
		<div id="solucion">
			<div>
				<h2>ALTA & CALCULO COSTE VIAJE</h2>
				<h3>Seleccione el numero de noches y el destino</h3>
				<form action="Controlador">
					<p>Noches</p><input type="text" name="noches">
					<p>Destino</p><select name="destino">	
						<option value="oviedo" >oviedo</option>
						<option value="tokyo" >tokyo</option>
						<option value="madrid" >madrid</option>
						<option value="barcelona" >barcelona</option>
					</select>
					<br>
					<br>
					<input type="hidden" name="action" value="altaviaje_costeviaje">
					<input type="submit" value="Dar de alta y calcular coste del viaje">
				</form>
				<h2>Solucion</h2>
				<form>
					Coste del hotel: <input type="text" value="${costeViaje.costeHotel}">
					<br>
					Coste del avion: <input type="text" value="${costeViaje.costeAvion}">
					<br>
					Coste del alquiler del coche: <input type="text" value="${costeViaje.costeAlquilerCoche}">
					<br>
					<br>
					<span>Coste TOTAL: <input type="text" value="${costeViaje.costeTotal}"></span>
				</form>
			</div>
			<div>
				<h2>CONSULTA</h2>
				<a href="/MVC-08-Examen_final/Controlador?action=consulta">Consulta</a>
			</div>
		</div>
				
	</body>
	
</html>