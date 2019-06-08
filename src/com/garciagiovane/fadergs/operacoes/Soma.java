package com.garciagiovane.fadergs.operacoes;

public class Soma implements Operacao {
	private double a;
	private double b;
	
	@Override
	public double calcular(double a, double b) {
		this.a = a;
		this.b = b;
		return a + b;
	}

	@Override
	public String toString() {
		return "Soma [a=" + a + ", b=" + b + "]";
	}
}
