package br.com.padroes.bridge.ex3;

public class Main {
	public static void main(String[] args) {
		new AvisoDevolucao(new GeradorAvisoEmail()).enviarAviso();;
	}
}
