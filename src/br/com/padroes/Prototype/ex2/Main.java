package br.com.padroes.Prototype.ex2;

public class Main {
	public static void main(String[] args) {
		
		Carro Carro1 = new Carro("Ferrari", "Toyota", "12434");
		
		Carro carro2 = Carro1.clonarObjeto();
		carro2.setChassi("543");
		
		Carro carro3 = Carro1.clonarObjeto();
		carro3.setChassi("567567567567");

		System.out.println(Carro1 +"\n"+carro2+"\n"+carro3);
		
	}
}