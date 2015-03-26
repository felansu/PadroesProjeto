package br.com.padroes.adapter;
import br.com.padroes.adapter.Colaborador;

public class ControleDePonto {

	public void registrarEntrada(Colaborador col) {
		System.out.println("Entrada " + col.getMatricula());
	}

	public void registrarSaida(Colaborador col) {
		System.out.println("Saida " + col.getMatricula());
	}
}
