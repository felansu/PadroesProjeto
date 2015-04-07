package br.com.padroes.builder.prova;

public class MainColaborador {
	public static void main(String[] args) {
		
		System.out.println(CalculoDeSalario.realizarCalculoSalario(1).calcularBonificacao(100D));
		System.out.println(CalculoDeSalario.realizarCalculoSalario(2).calcularBonificacao(100D));
	}
}
