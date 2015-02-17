package recordatorio.exercicios.revisao1.Ex6;

public class Analista extends Funcionario{
	
	@Override
	public double calcularBonificacao() {
		return super.getSalario() * 0.40;
	}

}
