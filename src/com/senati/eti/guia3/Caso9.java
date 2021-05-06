package com.senati.eti.guia3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("#.##");
		
		String nombre = "", rpta = "S", estado = "", n_mayor_p = "", n_menor_p ="";
		int num_reg = 0, o_cert = 0, n_cert = 0, nota1 = 21, nota2 = 21, nota3 = 21, na = 0;
		float mayor_promedio = 0, menor_promedio = 21;
		
		while(rpta.toUpperCase().equals("S")) {  //Bucle que repite el proceso con (s o S)
			num_reg++;
			System.out.println("----------------------");
			System.out.println("REGISTRO " + num_reg + ":");
			System.out.println("----------------------");
			
			System.out.print("Nombre de alumno: ");
			nombre = sc.nextLine();
			
			do {									//Lectura y validación de notas
			System.out.print("Nota 1: ");
			nota1 = sc.nextInt();
			System.out.print("Nota 2: ");
			nota2 = sc.nextInt();
			System.out.print("Nota 3: ");
			nota3 = sc.nextInt();
			if (nota1 > 20 || nota1 < 0 || nota2 > 20|| nota2 < 0 || nota3 > 20 || nota3 < 0) { //Mensaje de error
				System.out.println("----------------------");
				System.out.println("Una o más notas no son validas");
				System.out.println("Por favor ingrese las notas nuevamente");
				System.out.println("----------------------");
			}
			}while(nota1 > 20 || nota1 < 0 || nota2 > 20|| nota2 < 0 || nota3 > 20 || nota3 < 0); // Bucle y condicion de validación
			
			
			do {											//Lectura y validacion de asistencia
			System.out.print("Asistencia [0-12]: ");
			na = sc.nextInt();
			if (na >12 || na < 0) {
				System.out.println("----------------------");
				System.out.println("No valido");
				System.out.println("Intentelo nuevamente");
				System.out.println("----------------------");
			}
			}while(na > 12 || na < 0);						// Bucle y condicion de validación
			
			float promedio = nota1 * 0.2f + nota2 * 0.3f + nota3 * 0.5f;
			float porcentaje_asistencia = na * 100f / 12f;
			
			if (promedio >= 13 && porcentaje_asistencia >= 70) { 
				estado = "Obtiene Certificado";
				o_cert++;
			}
			else {
				estado = "Sin Certificado";
				n_cert++;
			}
			
			if (promedio >= mayor_promedio) {
				mayor_promedio = promedio;
				n_mayor_p = nombre;
				}
			if (promedio < menor_promedio) {
				menor_promedio = promedio;
				n_menor_p = nombre;
			}
			
			
			System.out.println("----------------");
			System.out.println("---Resultados---");
			System.out.println("----------------");
			System.out.println("Promedio: " + promedio);
			System.out.println("Asistencia: " + dc.format(porcentaje_asistencia) + "%");
			System.out.println("Estado: " + estado);
			
			sc.nextLine(); //Limpieza del buffer
			
			do {																//Lectura de repeticion de bucle principal
			System.out.println("----------------");
			System.out.print("¿Desea registrar otro participante? <S/N>: ");
			rpta = sc.nextLine();
			}while (!"S".equals(rpta.toUpperCase()) && !"N".equals(rpta.toUpperCase()));  //Validación de respuesta
			
			
		}
		System.out.println("\n---------------");
		System.out.println(" R E S U M E N ");
		System.out.println("---------------");
		System.out.println("Número de alumnos...................: " + num_reg);
		System.out.println("Mayor promedio..: " + dc.format(mayor_promedio) + " pertenece a..: " + n_mayor_p);
		System.out.println("Mayor promedio..: " + dc.format(menor_promedio) + " pertenece a..: " + n_menor_p);
		System.out.println("Número de alumnos certificados......: " + o_cert);
		System.out.println("Número de alumnos no certificados...: " + n_cert);

		
		
}
}