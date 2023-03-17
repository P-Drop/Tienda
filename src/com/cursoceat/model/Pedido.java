package com.cursoceat.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Pedido implements Internacional{

	private LocalDateTime fechaPedido;
	private LocalDateTime fechaEntrega;
	ArrayList<Producto> carrito = new ArrayList<>();
	private int [] cantidades = new int[0];
	private Cliente comprador;
	private double precioTotal;
	
	public Pedido() {
		
	}
	
	public Pedido(String nombre, String apellidos, String dni, Producto p, int cantidad) {
		this.comprador = new Cliente(nombre, apellidos, dni);
		this.fechaPedido = LocalDateTime.now();
		this.precioTotal = 0;
		carrito.add(p);
		cantidadProducto(cantidad);
	}

	public void cantidadProducto(int c) {
		cantidades = Arrays.copyOf(cantidades, cantidades.length+1);
		cantidades[cantidades.length-1]= c;
	}
	public LocalDateTime getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDateTime fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public ArrayList<Producto> getCarrito() {
		return carrito;
	}

	public void setCarrito(ArrayList<Producto> carrito) {
		this.carrito = carrito;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	@Override
	public void calcularIva() {
		
	}
	public void realizarPedido() {
		
	}
	public void aumentarCarrito(Producto p, int cant) {
		carrito.add(p);
		cantidadProducto(cant);
	}
	public void mostrarCarrito() {
		for (Producto c : carrito) {
			
		}
	}
}
