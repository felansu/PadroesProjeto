package br.com.padroes.factorymethod;

public class EmissorJMS implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Mensagem enviada pelo JMS: "+mensagem);
	}

}
