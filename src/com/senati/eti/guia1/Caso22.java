package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("DATOS DEL ALUMNO");
		System.out.println("----------------");
		System.out.print("Nombre........: ");
		String nombre = sc.nextLine();
		System.out.print("Nota 1........: ");
		int nota1 = sc.nextInt();
		System.out.print("Nota 2........: ");
		int nota2 = sc.nextInt();
		System.out.print("Nota 3........: ");
		int nota3 = sc.nextInt();

		float promedio = nota1*0.2f + nota2*0.3f + nota3*0.5f;
		
		System.out.println("\nResultado");
		System.out.println("-----------");
		System.out.println("Alumno........: " + nombre);
		System.out.println("Nota 1........: " + nota1);
		System.out.println("Nota 2........: " + nota2);
		System.out.println("Nota 3........: " + nota3);
		System.out.println("Promedio......: " + promedio);
		
	}
}
