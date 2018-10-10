package com.Alfonso20180603_Prueba_CRUD;

import java.util.ArrayList;
import java.util.Iterator;

public class Servicio {
	
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public void nuevoAlumno(String nombre, int edad){
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		alumno.setEdad(edad);
		
		alumnos.add(alumno);
	}
	
	public void eliminarAlumno(String nombre){
		Iterator<Alumno> it = alumnos.iterator();
		while (it.hasNext()) {
			Alumno alumno = it.next();
			if (alumno.getNombre().equals(nombre)) {
				it.remove();
			}
		}
	}
	
	public void modificarAlumno(String nombre, String nombre2, int edad2){
		Iterator<Alumno> it = alumnos.iterator();
		while (it.hasNext()) {
			Alumno alumno = it.next();
			if (alumno.getNombre().equals(nombre)) {
				alumno.setNombre(nombre2);
				alumno.setEdad(edad2);
			}
		}
	}
	
	public ArrayList<Alumno> getAlumno() {
		return alumnos;
	}
	
}
