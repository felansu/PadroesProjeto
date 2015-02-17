package recordatorio.exercicios.revisao1.Ex6;

public class Programador extends Funcionario{

	@Override
	public double calcularBonificacao() {
		return super.getSalario() * 0.30 ;
	}

}
