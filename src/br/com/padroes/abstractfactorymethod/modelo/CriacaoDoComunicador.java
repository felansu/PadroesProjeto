package br.com.padroes.abstractfactorymethod.modelo;

public class CriacaoDoComunicador {
	private static Integer VISA = 1;
	private static Integer MASTER_CARD = 2;
	private static Integer AE = 3;
	
	public static ComunicadorFactory getComunicador(Integer tipo) {
		ComunicadorFactory com = null;
		if (tipo.equals(VISA)) {
			com = new VisaComunicadorFactory();
		}else if(tipo.equals(MASTER_CARD)){
			com = new MasterCardComunicadorFactory();
		}else if (tipo.equals(AE)) {
			com = new AEComunicadorFactory();
		}
		return com;
	}
}