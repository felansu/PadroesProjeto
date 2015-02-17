package recordatorio.exercicios.revisao1.Ex6;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario = 1000;
	
	public abstract double calcularBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
