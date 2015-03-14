package br.com.padroes.factorymethod.ex1;

public class EmissorEmail implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Mensagem enviada por E-mail: "+mensagem);
	}

}
