package br.com.padroes.factorymethod.ex2;

public class Builder {
	static final int MATRICIAL= 0;
	static final int LASER= 1;
	static final int JATOTINTA= 2;
	
	
	public static Impressora criar(Integer tipo){
		Impressora impressora = null;
		if (tipo.equals(MATRICIAL)) {
			impressora = new Matricial();
		}else if (tipo.equals(LASER)) {
			impressora = new Laser();
		}else if (tipo.equals(JATOTINTA)) {
			impressora = new JatoTinta();
		}
		return impressora;
	}
}
