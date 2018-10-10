package com.Alfonso20180515_Examen_Libreria;

import java.io.PrintStream;

	public class LasOEstanProhibidasException extends Exception {
		@Override
		public void printStackTrace(PrintStream s) {
			// TODO Auto-generated method stub
			super.printStackTrace(s);
			System.out.println("No se puede modificar un libro que contenga la letra 'O' en su título");
		}
		
}
