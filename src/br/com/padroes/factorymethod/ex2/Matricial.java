package br.com.padroes.factorymethod.ex2;

public class Matricial implements Impressora{

	@Override
	public void imprimir(String texto) {
		System.out.printf("Imprimindo matricial: %s \n", texto);
	}

}
