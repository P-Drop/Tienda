package com.cursoceat.model;

public class Producto {

	private static int idTotal;
	private int idProducto;
	private String nombre;
	private String desCorta;
	private String desLarga;
	private double precio;
	private String imagenURL;
	private int stock;
	
	public Producto() {
		this.idProducto = asignarID();
	}
	public Producto(String nombre, String desCorta, String desLarga, double precio, String imagenURL) {
		this.nombre = nombre;
		this.desCorta = desCorta;
		this.desLarga = desLarga;
		this.precio = precio;
		this.imagenURL = imagenURL;
		this.idProducto = asignarID();
		this.stock = 1;
	}
	
	private static int asignarID() {
		return ++idTotal;	
	}
	public int getIdProducto() {
		return idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesCorta() {
		return desCorta;
	}
	public void setDesCorta(String desCorta) {
		this.desCorta = desCorta;
	}
	public String getDesLarga() {
		return desLarga;
	}
	public void setDesLarga(String desLarga) {
		this.desLarga = desLarga;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getImagenURL() {
		return imagenURL;
	}
	public void setImagenURL(String imagenURL) {
		this.imagenURL = imagenURL;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void aumentarStock (int cantidad) {
		this.stock += cantidad;
	}
	
	public void venderProducto(int cantidad) {
		if(this.stock >= cantidad) {
		this.stock -=cantidad;
		}
		else {
			System.out.println("PRODUCTO AGOTADO");
		}
	}
}
