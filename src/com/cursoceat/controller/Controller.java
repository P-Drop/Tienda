package com.cursoceat.controller;

import com.cursoceat.ui.*;

public class Controller {

	public static void main(String[] args) {
		ConfigurarTienda startTienda = new ConfigurarTienda();
		startTienda.crearTienda();
		Menu miMenu = new Menu();
		miMenu.menuPrincipal();
	}
}
