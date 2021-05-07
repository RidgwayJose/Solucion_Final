package com.senati.eti.guia4;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Definir la matriz de números 3x4
		int[][] nNumeros = new int [3][4];
		
		int num_mayor = 0;
		int num_menor = 0;
		float suma = 0, promedio = 0;
		
		for(int f = 0; f < nNumeros.length; f++) {
			System.out.println("\nFila: " + (f + 1));
			System.out.println("-------");
			
			for(int c = 0; c < nNumeros[0].length; c++) {
				System.out.print("Número " + (c + 1) + ": ");
				nNumeros[f][c] = sc.nextInt();			
			
				if (f == 0 && c == 0) {
					num_mayor = nNumeros[0][0];
					num_menor = nNumeros[0][0];
				} else {
					if (nNumeros[f][c] > num_mayor) num_mayor = nNumeros[f][c];
					if (nNumeros[f][c] < num_menor) num_menor = nNumeros[f][c];
				}
			suma = suma + nNumeros[f][c];
			}
		}
		promedio = suma / 12;
		
		System.out.println("\nResultados");
		System.out.println("-------------");
		System.out.println("Número mayor......: " + num_mayor);
		System.out.println("Número menor......: " + num_menor);
		System.out.println("Suma..............: " + suma);
		System.out.println("Promedio..........: " + promedio);
	}
}