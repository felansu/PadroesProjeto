package recordatorio.exercicios.revisao1.Ex4;

public class Colaborador extends Pessoa {
	private String cargo = "teste";
	private Double salario = 3.3;
	
	@Override
	public String toString() {
		return super.toString() +"Colaborador [cargo=" + cargo + ", salario=" + salario + "]";
	}
	
}
