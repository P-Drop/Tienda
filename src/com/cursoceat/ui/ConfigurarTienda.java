package com.cursoceat.ui;

import com.cursoceat.model.*;

public class ConfigurarTienda {

	public Tienda miTienda;
	public void crearTienda() {
		miTienda = new Tienda();
		miTienda.definirProductos();
		miTienda.iniciarSesion();
	}
}
