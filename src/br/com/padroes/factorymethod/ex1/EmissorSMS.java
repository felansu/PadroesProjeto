package br.com.padroes.factorymethod.ex1;

public class EmissorSMS implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Mensagem enviado por SMS: "+mensagem);
	}

}
