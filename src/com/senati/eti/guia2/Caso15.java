package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#.##");

		
		System.out.print("Ingrese Cliente: ");
		String nombre = sc.nextLine();
		
		
		System.out.print("Ingrese Producto [TB/LT/MN/IM]...: ");
		String producto = sc.nextLine();
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Forma de Pago [C1/C2]...: ");
		String pago = sc.nextLine();
		int precio = 0;
		
		switch(producto.toUpperCase( )) {
        	case("TB"):
        		producto = "Tablet";
		    	precio = 350;
		    	break;
        
        	case("LT"):
        		producto = "Laptop";
		    	precio = 2300;
		    	break;		
        
        	case("MN"):
        		producto = "Monitor";
		    	precio = 850;
		    	break;
		    	
        	case("IM"):
        		producto = "Impresora";
		    	precio = 680;
		    	break;
		    	
        	default:
        		producto = "Producto no disponible";
        		precio = 0;
        
		}
        		
		int importe = cantidad * precio;
		String des_o_inc = "";
		float monto = 0;
		
		while(!"C1".equals(pago.toUpperCase()) && !"C2".equals(pago.toUpperCase())) {
			System.out.print("Forma de Pago [C1/C2]...: ");
			pago = sc.nextLine();
		}
		
		switch(pago.toUpperCase()) {
        
			case("C1"):
				pago = "Contado";
				des_o_inc = "Descuento............: ";
				monto = - importe * 0.05f;
				break;
		
			case("C2"):
				pago = "Crédito";
				des_o_inc = "Incremento...........: ";
				monto = importe * 0.12f;
				break;
			}
		
        System.out.println("\n-----------------------");
 	   	System.out.println("R E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Cliente..............: " + nombre);
        System.out.println("Producto.............: " + producto);
        System.out.println("Precio...............: " + precio);
        System.out.println("Cantidad.............: " + cantidad);
        System.out.println("Importe..............: " + importe);
        System.out.println("Forma de pago........: " + pago);
        System.out.println(des_o_inc + dec.format(Math.abs(monto)));
        System.out.println("Total a pagar........: " + dec.format((importe + monto)));
	}

}
