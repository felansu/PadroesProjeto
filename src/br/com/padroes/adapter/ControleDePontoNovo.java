package br.com.padroes.adapter;

public class ControleDePontoNovo {
	public void registrarAcesso(String matricula, boolean entrada) {
		if (entrada)
			System.out.println("Entrada " + matricula);
		else
			System.out.println("Saida " + matricula);
			
	}
}
