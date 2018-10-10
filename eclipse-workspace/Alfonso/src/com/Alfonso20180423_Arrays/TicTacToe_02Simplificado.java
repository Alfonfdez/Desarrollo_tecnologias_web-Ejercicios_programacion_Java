package com.Alfonso20180423_Arrays;

import java.util.Scanner;

public class TicTacToe_02Simplificado {

	public static void main(String[] args) {

		String[] tablero = { "_", "_", "_", "_", "_", "_", "_", "_", "_" }; // tablero[0] = X, tablero[1] = O,

		TicTacToe_02Simplificado tictactoe = new TicTacToe_02Simplificado();
		tictactoe.showTablero(tablero);

		int jugador = 0;
		String signo = "";
		
		while(true) {

			if (jugador % 2 == 0) {
				signo = "X";
				tictactoe.juegaPlayer(signo, tablero);
				tictactoe.showTablero(tablero);
				boolean ganar = tictactoe.evaluateWin(tablero);
				if(ganar) {
					System.out.println("Has ganado Player: " + signo);
					break;
				}
				jugador++;
			} else {
				signo = "O";
				tictactoe.juegaPlayer(signo, tablero);
				tictactoe.showTablero(tablero);
				boolean ganar = tictactoe.evaluateWin(tablero);
				if(ganar) {
					System.out.println("Has ganado Player: " + signo);
					break;
				}
				jugador++;
			}

		}

	}

	public void showTablero(String[] tablero) {

		System.out.println(tablero[0] + "          " + tablero[1] + "          " + tablero[2]);
		System.out.println();
		System.out.println();
		System.out.println(tablero[3] + "          " + tablero[4] + "          " + tablero[5]);
		System.out.println();
		System.out.println();
		System.out.println(tablero[6] + "          " + tablero[7] + "          " + tablero[8]);
		System.out.println();

	}

	public void juegaPlayer(String signo, String[] tablero) {

		Scanner lector = new Scanner(System.in);
		System.out.println(
				"Elige la posición: Posición 0 arriba izqda. / Posición 1 arriba medio / Posición 2 arriba derecha / Posición 3 medio izqda. / Posición 4 medio medio / Posición 5 medio derecha / Posición 6 abajo izqda. / Posición 7 abajo medio / Posición 8 abajo derecha / ");
		int posicion = lector.nextInt();
		tablero[posicion] = signo;

	}

	public boolean evaluateWin(String [] tablero) {
		if(tablero[0]==tablero[1] && tablero[0]==tablero[2] && tablero[0]!="_") {
			return true;
		} else if(tablero[3]==tablero[4] && tablero[3]==tablero[5] && tablero[3]!="_") {
		return true;
		} else if(tablero[6]==tablero[7] && tablero[6]==tablero[8] && tablero[6]!="_") {
			return true;
		} else if(tablero[0]==tablero[3] && tablero[0]==tablero[6] && tablero[0]!="_") {
			return true;
		} else if(tablero[1]==tablero[4] && tablero[1]==tablero[7] && tablero[1]!="_") {
			return true;
		} else if(tablero[2]==tablero[5] && tablero[2]==tablero[8] && tablero[2]!="_") {
			return true;
		} else if(tablero[0]==tablero[4] && tablero[0]==tablero[8] && tablero[0]!="_") {
			return true;
		} else if(tablero[2]==tablero[4] && tablero[2]==tablero[6] && tablero[2]!="_") {
			return true;
		} else return false;
	}
}