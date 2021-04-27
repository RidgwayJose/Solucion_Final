package com.senati.eti.guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#.##");
		
		System.out.print("Ingrese el primer monto...: ");
		int monto1 = sc.nextInt();
		System.out.print("Ingrese el segundo monto..: ");
		int monto2 = sc.nextInt();
		System.out.print("Ingrese el tercer monto...: ");
		int monto3 = sc.nextInt();
		
		float rpta1 = monto1 / 5 + monto2 * 0.2f;
		float rpta2 = monto3 * 1.6f / 2;
		float rpta3 = (monto1 + monto2 + monto3)* 0.92f;
		
		System.out.println("\nResultado");
		System.out.println("-----------");
		System.out.println("Respuesta 1........: " + dec.format(rpta1));
		System.out.println("Respuesta 2........: " + dec.format(rpta2));
		System.out.println("Respuesta 3........: " + dec.format(rpta3));

		
		



	}

}
