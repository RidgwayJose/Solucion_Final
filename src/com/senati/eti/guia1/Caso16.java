package com.senati.eti.guia1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas: ");
		int horas = sc.nextInt();
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = 0.05f * sueldo;
		float total = sueldo + bono;
		float total_$ = total / 3.24f;
		
		System.out.println("\nResultados");
		System.out.println("Sueldo.............: " + dec.format(sueldo));
		System.out.println("Bono...............: " + dec.format(bono));
		System.out.println("Total..............: " + dec.format(total));
		System.out.println("Total en dólares...: " + dec.format(total_$));
	}

}
