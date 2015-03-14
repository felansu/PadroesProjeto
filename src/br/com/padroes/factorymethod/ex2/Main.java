package br.com.padroes.factorymethod.ex2;

public class Main {
	public static void main(String[] args) {
		Builder.criar(Builder.MATRICIAL).imprimir("que que isso !");
		Builder.criar(Builder.LASER).imprimir("Nossa senhora !");
		Builder.criar(Builder.JATOTINTA).imprimir("Este é um exemplo");
	}
}
