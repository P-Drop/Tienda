package com.cursoceat.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	private static int numPedido;
	private static ArrayList<Producto> misProductos = new ArrayList<>();
	private static ArrayList<Pedido> misPedidos = new ArrayList<>();
	private static ArrayList<Cliente> misClientes = new ArrayList<>();
	static Scanner keyboard = new Scanner(System.in);
	
	public Tienda() {
		numPedido=1;
	}
	
	public void definirProductos() {
		Producto producto1 = new Producto("producto1", "dcp1", "Descripcion larga producto 1", 10.50, "PD:Rulez\\calibra\\EH.jpeg");
		Producto producto2 = new Producto("producto2", "dcp2", "Descripcion larga producto 2", 11.50, "PD:Rulez\\calibra\\T30.jpeg");
		Producto producto3 = new Producto("producto3", "dcp3", "Descripcion larga producto 3", 12.50, "PD:Rulez\\calibra\\Ba0Fe1.jpeg");
		Producto producto4 = new Producto("producto4", "dcp4", "Descripcion larga producto 4", 13.50, "PD:Rulez\\calibra\\TomaccoRubio.jpeg");
		Producto producto5 = new Producto("producto5", "dcp5", "Descripcion larga producto 5", 14.50, "PD:Rulez\\calibra\\P-Byte.jpeg");
		misProductos.add(producto1);
		misProductos.add(producto2);
		misProductos.add(producto3);
		misProductos.add(producto4);
		misProductos.add(producto5);
	}
	
	public void iniciarSesion() {
		System.out.print("\nINICIAR SESION\n\nNombre -> ");
		String nom = keyboard.next();
		keyboard.nextLine();
		System.out.print("Apellidos -> ");
		String ape = keyboard.nextLine();
		System.out.print("DNI -> ");
		String dni = keyboard.next();
		Cliente user = new Cliente(nom, ape, dni);
		misClientes.add(user);
	}
	
	public static void mostrarProductos() {
		for (Producto p : misProductos) {
			System.out.println("\nProducto: "+p.getNombre());
			System.out.println(p.getDesLarga());
			System.out.print("Imagen: "+p.getImagenURL()+"\nPrecio: ");
			System.out.printf("%.2f",p.getPrecio());
			System.out.println(" €\nID: "+p.getIdProducto());
		}
	}
	public static void comprarProductos() {
		boolean primerProducto = true;
		System.out.println("PRODUCTOS");
		for (Producto p : misProductos) {
			System.out.println("\nProducto: "+p.getNombre());
			System.out.print(p.getDesCorta()+"\nPrecio: ");
			System.out.printf("%.2f",p.getPrecio());
			System.out.println(" €\nID: "+p.getIdProducto());
		}
		do {
		System.out.print("\nID de producto que desea comprar: ");
		int id = keyboard.nextInt();
		System.out.print("Cantidad: ");
		int cantidad = keyboard.nextInt();
		if(primerProducto) {
			Pedido p = new Pedido(misClientes.get(0).getNombre(), misClientes.get(0).getApellido(), misClientes.get(0).getDni(), buscarProducto(id), cantidad);
			misPedidos.add(p);
		}
		else {
			misPedidos.get(numPedido-1).aumentarCarrito(buscarProducto(id),cantidad);
		}
		System.out.println("¿Continuar comprando? (s/n)");
		String continuar = keyboard.next();
		if(continuar.equals("n")) {
			break;
		}
		}while(true);
		System.out.println("Proceda a realizar el pedido");
	}
	public static void realizarPedido() {
		System.out.println("\nCARRITO\n");
		misPedidos.get(numPedido-1).mostrarCarrito();
		System.out.print("¿Confirmar la compra? (s/n): ");
		if(keyboard.next().equals("s")) {
			keyboard.nextLine();
			System.out.print("Introduce direccion: ");
			String dir = keyboard.nextLine();
			misClientes.get(0).setDireccion(dir);
			System.out.print("Introduce localidad: ");
			String loc = keyboard.nextLine();
			misClientes.get(0).setLocalidad(loc);
			System.out.print("Introduce pais (España, Francia o Portugal): ");
			String pais = keyboard.nextLine();
			misClientes.get(0).asignarPais(pais);
			System.out.print("Introduce telefono: ");
			String tel = keyboard.nextLine();
			misClientes.get(0).setTelefono(tel);
			
			pagar();
			mostrarFactura();
			
			numPedido++;
		}
		else {
			System.out.println("Se va a eliminar el pedido");
			misPedidos.remove(numPedido-1);
		}		
	}
	public static void mostrarPedido() {
		for (Producto p : misProductos) {
			System.out.println("\nProducto: "+p.getNombre());
			System.out.println(p.getDesLarga());
			System.out.println("Imagen: "+p.getImagenURL());
			System.out.println("Precio: "+p.getPrecio());
			System.out.println("ID: "+p.getIdProducto());
		}
	}
	public static void mostrarCliente() {
		for (Producto p : misProductos) {
			System.out.println("\nProducto: "+p.getNombre());
			System.out.println(p.getDesLarga());
			System.out.println("Imagen: "+p.getImagenURL());
			System.out.println("Precio: "+p.getPrecio());
			System.out.println("ID: "+p.getIdProducto());
		}
	}
	
	public static Producto buscarProducto(int id) {
		int index = 0;
		for(int i=0; i<misProductos.size();i++) {
		if(id==misProductos.get(i).getIdProducto()) {
			index = i;
			break;
		}
		}
		return misProductos.get(index);
	}
	
	public static void pagar() {
		System.out.println("\nEl cliente paga\n");
	}
	
	public static void mostrarFactura() {
		System.out.println("\nSe muestra la factura\n");
	}
}
