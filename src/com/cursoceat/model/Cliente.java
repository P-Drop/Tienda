package com.cursoceat.model;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private String localidad;
	private Paises pais;
	private String telefono;
	private String dni;
	private static int idTotal;
	private int idCliente;
	
	public Cliente() {
		this.idCliente = asignarID();
	}
	
	public Cliente(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellido = apellidos;
		this.dni = dni;
		this.idCliente = asignarID();
	}
	public Cliente(String nombre, String apellido, String direccion, String localidad, String pais, String telefono,
			String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
		this.dni = dni;
		this.idCliente= asignarID();
		this.asignarPais(pais);
	}
	void asignarPais(String pais) {
		pais = pais.toUpperCase();
		if(pais.equals("ESPAÑA")) {
			this.pais = Paises.ESPANA;
		}
		else if(pais.equals("FRANCIA")) {
			this.pais = Paises.FRANCIA;
		}
		else if(pais.equals("PORTUGAL")) {
			this.pais = Paises.PORTUGAL;
		}
		else {
			System.out.println("ERROR: El nombre del pais no es válido. Pais por defecto: España");
			this.pais = Paises.ESPANA;
		}
	}
	
	private static int asignarID() {
		return ++idTotal;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdCliente() {
		return idCliente;
	}

	
	
	
}
