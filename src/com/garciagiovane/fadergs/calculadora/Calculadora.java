package com.garciagiovane.fadergs.calculadora;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.garciagiovane.fadergs.operacoes.Divisao;
import com.garciagiovane.fadergs.operacoes.Multiplicacao;
import com.garciagiovane.fadergs.operacoes.Operacao;
import com.garciagiovane.fadergs.operacoes.Soma;
import com.garciagiovane.fadergs.operacoes.Subtracao;

public class Calculadora extends Historico {
	Map<String, Operacao> operacoes = new HashMap<String, Operacao>();

	public Calculadora() {
		operacoes.put("+", new Soma());
		operacoes.put("-", new Subtracao());
		operacoes.put("/", new Divisao());
		operacoes.put("*", new Multiplicacao());
	}

	public String calcular(double a, double b, String operacao) {
		try {
			Operacao oper = operacoes.get(operacao);
			if (oper instanceof Divisao && b == 0) {
				 return "Não pode divir por zero!";
			}
			double resultado = oper.calcular(a, b);
			gravarOperacao(oper);
			return "Resultado: " + resultado;
		} catch (Exception e) {
			return "Operação inválida!";
		}
	}

	@Override
	public void gravarOperacao(Operacao operacao) {
		super.gravarOperacao(operacao);
	}

	@Override
	public List<Operacao> mostrarHistorico() {
		return super.mostrarHistorico();
	}
}
