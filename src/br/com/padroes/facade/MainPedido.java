package br.com.padroes.facade;

public class MainPedido {
	public static void main(String[] args) {
		Cliente cli = new Cliente(1, "Reinaldo", "1111", 1000D);
		Produto pro = new Produto(1, "Teclado", 30);
		SPC spc = new SPC();
		Pedido ped = new Pedido(1, 100, cli, new PedidoItems(3,1D,pro));
		
		spc.validarPessoa(cli.getCpf());
		cli.validarLimiteCredito(30);
		ped.imprimirPedido();
	}
}
