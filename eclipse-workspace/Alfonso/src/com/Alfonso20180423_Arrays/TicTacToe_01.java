package com.Alfonso20180423_Arrays;

import java.util.Scanner;

public class TicTacToe_01 {

	public static void main(String[] args) {
		

		String[] tablero = { "_", "_", "_", "_", "_", "_", "_", "_", "_" }; // tablero[0] = X, tablero[1] = O,
		
			System.out.println(tablero[0] + "          " + tablero[1] + "          " + tablero[2]);
			System.out.println();
			System.out.println();
			System.out.println(tablero[3] + "          " + tablero[4] + "          " + tablero[5]);
			System.out.println();
			System.out.println();
			System.out.println(tablero[6] + "          " + tablero[7] + "          " + tablero[8]);
			System.out.println();
			
			Scanner lector = new Scanner(System.in);
			
			boolean ok = true;
			
			
			while(ok==true) {
			
				System.out.println("Juega el jugador 1 (X), elige la posici�n: Posici�n 0 arriba izqda. / Posici�n 1 arriba medio / Posici�n 2 arriba derecha / Posici�n 3 medio izqda. / Posici�n 4 medio medio / Posici�n 5 medio derecha / Posici�n 6 abajo izqda. / Posici�n 7 abajo medio / Posici�n 8 abajo derecha / ");
				int jugador1 = lector.nextInt();
				
				for(int i=0; i<9; i++) {
					if(i==jugador1) {
						tablero[i]="X";
					} else;
				}
				
				System.out.println(tablero[0] + "          " + tablero[1] + "          " + tablero[2]);
				System.out.println();
				System.out.println();
				System.out.println(tablero[3] + "          " + tablero[4] + "          " + tablero[5]);
				System.out.println();
				System.out.println();
				System.out.println(tablero[6] + "          " + tablero[7] + "          " + tablero[8]);
				
				if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && tablero[0].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				} 	else if(tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && tablero[0].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				}	else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && tablero[0].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				}	else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && tablero[1].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				}	else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && tablero[2].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				}	else if(tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && tablero[2].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				}	else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && tablero[3].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				}	else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && tablero[6].equals("X")) {
					System.out.println("Jugador 1 ha ganado");
					ok=false;
				} 	else;
				
				
				
				if(ok==false) {
					
				} else {
		
					System.out.println("Juega el jugador 2 (O), elige la posici�n: Posici�n 0 arriba izqda. / Posici�n 1 arriba medio / Posici�n 2 arriba derecha / Posici�n 3 medio izqda. / Posici�n 4 medio medio / Posici�n 5 medio derecha / Posici�n 6 abajo izqda. / Posici�n 7 abajo medio / Posici�n 8 abajo derecha / ");
					int jugador2 = lector.nextInt();
					
					for(int i=0; i<9; i++) {
						if(i==jugador2) {
							tablero[i]="O";
						} else;	
					}
					
					System.out.println(tablero[0] + "          " + tablero[1] + "          " + tablero[2]);
					System.out.println();
					System.out.println();
					System.out.println(tablero[3] + "          " + tablero[4] + "          " + tablero[5]);
					System.out.println();
					System.out.println();
					System.out.println(tablero[6] + "          " + tablero[7] + "          " + tablero[8]);
					
					if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && tablero[0].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					} 	else if(tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && tablero[0].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					}	else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && tablero[0].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					}	else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && tablero[1].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					}	else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && tablero[2].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					}	else if(tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && tablero[2].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					}	else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && tablero[3].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					}	else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && tablero[6].equals("O")) {
						System.out.println("Jugador 2 ha ganado");
						ok=false;
					} 	else;
				}
				
				
				
			}
		
			
			
	}
	
		
}