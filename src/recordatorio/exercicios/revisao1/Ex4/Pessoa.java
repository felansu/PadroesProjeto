package recordatorio.exercicios.revisao1.Ex4;

public class Pessoa {
	private String nome = "Aparecida";
	private int idade = 22;
	private String sexo = "Feminino";
	private String cpf ="234234";
	private String endereco = "rua 2";
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo
				+ ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	

}
