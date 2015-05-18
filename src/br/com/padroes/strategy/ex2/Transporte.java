package br.com.padroes.strategy.ex2;

import java.util.List;

public class Transporte {

	private int id;
	private Cliente cliente;
	private List<TransporteItens> listaProdutos;

	public Transporte(int id, Cliente cliente,
			List<TransporteItens> listaProdutos) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.listaProdutos = listaProdutos;
	}

	public Transporte() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<TransporteItens> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<TransporteItens> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public double calculaFrete() {
		double valorTotalProdutos = 0;
		Frete estrategiaFrete = null;
		switch (getCliente().getUf()) {
		case "GO":
			estrategiaFrete = new FreteGoiania();
			break;
		case "SP":
			estrategiaFrete = new FreteSaoPaulo();
			break;
		case "DF":
			estrategiaFrete = new FreteDistritoFederal();
			break;
		case "MG":
			estrategiaFrete = new FreteMinasGerais();
			break;
		}
		// Totaliza o valor dos Produtos Comprados
		for (TransporteItens transporteItens : getListaProdutos()) {
			valorTotalProdutos += transporteItens.getQtde()
					* transporteItens.getProduto().getPreco();
		}
		// Retorna o valor do Frete
		return (estrategiaFrete.calcularFrete(valorTotalProdutos));
	}

}
