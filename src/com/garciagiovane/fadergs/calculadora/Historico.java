package com.garciagiovane.fadergs.calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.garciagiovane.fadergs.operacoes.Operacao;

public class Historico {
	private List<Operacao> historicoOperacoes = new ArrayList<Operacao>();
	
	public void gravarOperacao(Operacao operacao) {
		historicoOperacoes.add(operacao);
	}
	
	public List<Operacao> mostrarHistorico(){
		return Collections.unmodifiableList(historicoOperacoes);
	}
}
