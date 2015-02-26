package br.com.padroes.Prototype.ex1;

public class Main {
	public static void main(String[] args) {
		String titulo = "Carros usados !";
		String valor = "5000";
		String tempo = "30 dias";
		
		Campanha c1 = new Campanha(titulo, valor, tempo);
		System.out.println(c1);
		
		c1 = c1.clone();
		System.out.println(c1);
	}
}
