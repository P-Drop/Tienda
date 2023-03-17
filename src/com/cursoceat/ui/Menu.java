package com.cursoceat.ui;

import java.util.Scanner;

import com.cursoceat.model.Tienda;

public class Menu {

	static Scanner keyboard = new Scanner(System.in);
	public void menuPrincipal() {
		boolean salir = false;
		do {
			System.out.println("\nMENU PRINCIPAL USUARIO");
			System.out.println("1. Mostrar productos");
			System.out.println("2. Comprar productos");
			System.out.println("3. Realizar pedido");
			System.out.println("4. Datos de pedido");
			System.out.println("5. Datos de cliente");
			System.out.println("6. Salir");
			System.out.print("\nOpcion -> ");
			int opcion = keyboard.nextInt();
			switch(opcion) {
			case 1 -> Tienda.mostrarProductos();
			case 2 -> Tienda.comprarProductos();
			case 3 -> Tienda.realizarPedido();
			case 4 -> Tienda.mostrarPedido();
			case 5 -> Tienda.mostrarCliente();
			case 6 -> salir=true;
			default -> System.out.println("ERROR: Opcion no válida");
			}
		}while(!salir);
		
		System.out.println("Hasta luego");
		keyboard.close();
	}
}
