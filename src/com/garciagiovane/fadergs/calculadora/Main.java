package com.garciagiovane.fadergs.calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		@SuppressWarnings("resource")
		Scanner leitura = new Scanner(System.in);
		
		while (true) {
			System.out.println("********** Selecione a opera��o **********"
					+ "\n(+) - Soma"
					+ "\n(-) - Subtra��o"
					+ "\n(*) - Multiplica��o"
					+ "\n(/) - Divis�o"
					+ "\n(H) - Hist�rico"
					+ "\n(0) - Sair");
			String operacao = leitura.next();
			
			if (operacao.equals("0")) {
				System.out.println("Sistema encerrado!");
				System.exit(0);
			} else if (operacao.equalsIgnoreCase("h")) {
				calculadora.mostrarHistorico().forEach(ops -> System.out.println(ops));
			} else {
				System.out.println("Digite o 1� valor");
				double a = leitura.nextDouble();
				System.out.println("Digite o 2� valor");
				double b = leitura.nextDouble();
				
				System.out.println(calculadora.calcular(a, b, operacao));
			}
		}
	}
}
