package br.com.padroes.facade;

public class Pedido {
	private int id;
	private double valorTotal;
	private Cliente cliente;
	private PedidoItems items;

	public Pedido(int id, double valorTotal, Cliente cliente, PedidoItems items) {
		super();
		this.id = id;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void imprimirPedido() {
		System.out.println("PEDIDO IMPRESSO !!!");
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PedidoItems getItems() {
		return items;
	}

	public void setItems(PedidoItems items) {
		this.items = items;
	}

}
