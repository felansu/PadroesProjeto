package br.com.padroes.strategy.ex2;

import java.util.ArrayList;
import java.util.List;


public class MainTransporte {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Ferran", "SP");
		Produto produto = new Produto(1, "Terno", 12D);
		TransporteItens item = new TransporteItens(10, produto);
		List<TransporteItens> itens = new ArrayList<TransporteItens>();
		itens.add(item);
		Transporte transporte = new Transporte(1, cliente, itens);
		System.out.println(transporte.calculaFrete());
	}
}
