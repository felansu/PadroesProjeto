package br.com.padroes.factorymethod;

public class EmissorSMS implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Mensagem enviado por SMS: "+mensagem);
	}

}
