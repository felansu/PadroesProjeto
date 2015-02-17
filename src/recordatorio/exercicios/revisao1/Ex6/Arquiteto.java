package recordatorio.exercicios.revisao1.Ex6;

public class Arquiteto extends Funcionario{

	@Override
	public double calcularBonificacao() {
		return super.getSalario() * 0.50;
	}
	
}
