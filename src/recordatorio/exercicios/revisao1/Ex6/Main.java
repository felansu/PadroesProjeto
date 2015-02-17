package recordatorio.exercicios.revisao1.Ex6;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario = new Analista();
		System.out.println("Bonificação do analista: " +funcionario.calcularBonificacao());
		
		funcionario = new Programador();
		System.out.println("Bonificação do programador: " +funcionario.calcularBonificacao());
		
		funcionario = new Arquiteto();
		System.out.println("Bonificação do arquiteto: " +funcionario.calcularBonificacao());
	}
}
