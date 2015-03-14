package br.com.padroes.factorymethod.ex2;

public class Laser implements Impressora{

	@Override
	public void imprimir(String texto) {
		System.out.printf("Imprimindo laser: %s \n", texto);
	}

}
