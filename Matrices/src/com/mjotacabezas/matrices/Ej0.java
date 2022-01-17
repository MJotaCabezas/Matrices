/**
 * 
 */
package com.mjotacabezas.matrices;

import java.util.Scanner;

/**
 * @author MJotaCabezas
 * Clase que pide matriz por teclado y la muestra por pantalla.
 *
 */
public class Ej0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Cuántas filas quieres?:");
		int filas=entrada.nextInt();
		
		System.out.println("¿Cuántas columnas quieres?:");
		int columnas=entrada.nextInt();
		
		System.out.println("Introduce la matriz");
		int[][] matriz = new int [filas][columnas];
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es: ");
		Matrices.mostrar_matriz(matriz);
		
		
	}
		}
