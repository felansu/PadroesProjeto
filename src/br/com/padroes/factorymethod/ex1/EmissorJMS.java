package br.com.padroes.factorymethod.ex1;

public class EmissorJMS implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Mensagem enviada pelo JMS: "+mensagem);
	}

}
