package com.cursoceat.model;

public enum Paises {
	ESPANA(21,3), FRANCIA(20,7), PORTUGAL(23,4);
	
	public final int ivaPais;
	public final int diasEntrega;
	private Paises(int ivaPais, int delay) {
		this.ivaPais = ivaPais;
		this.diasEntrega = delay;
	}
}
