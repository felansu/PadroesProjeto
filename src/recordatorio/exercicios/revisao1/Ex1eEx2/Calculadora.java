package recordatorio.exercicios.revisao1.Ex1eEx2;

public class Calculadora {
	private double numero1;
	private double numero2;
	
	Calculadora(double infoNumero1, double infoNumero2) {
		this.numero1 = infoNumero1;
		this.numero2 = infoNumero2;
	}
	
	void soma(){
		System.out.println("Soma: " + (numero1+numero2));
	}
	
	void subtrai(){
		System.out.println("Subtração: " + (numero1-numero2));
	}
	
	void multiplicacao(){
		System.out.println("Multiplicação: " + numero1*numero2);
	}
	
	void divisao(){
		System.out.println("Divisão: " + numero1/numero2);
	}
	
	
}
