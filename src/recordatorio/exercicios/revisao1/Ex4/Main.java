package recordatorio.exercicios.revisao1.Ex4;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa = new Cliente();
		System.out.println(pessoa.toString());
		
		pessoa = new Colaborador();
		pessoa.toString();
		System.out.println(pessoa.toString());
		
	}

}
