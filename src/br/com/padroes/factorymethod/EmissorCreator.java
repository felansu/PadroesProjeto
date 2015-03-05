package br.com.padroes.factorymethod;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public Emissor create(int tipoEmissao){
		if (tipoEmissao == EmissorCreator.SMS) {
			return new EmissorSMS();
		}else if(tipoEmissao == EmissorCreator.EMAIL){
			return new EmissorEmail();
		}else if(tipoEmissao == EmissorCreator.JMS){
			return new EmissorJMS();
		}else{
			throw new IllegalArgumentException("Tipo de emissão não suportada");
		}
	}
}
