package com.garciagiovane.fadergs.operacoes;

public class Divisao implements Operacao {
	private double a;
	private double b;
	
	@Override
	public double calcular(double a, double b) {
		this.a = a;
		this.b = b;
		return this.a / this.b;
	}

	@Override
	public String toString() {
		return "Divisao [a=" + a + ", b=" + b + "]";
	}
}
