package br.com.padroes.facade;

public class SPC {

	public void validarPessoa(String cpf) {
		System.out.println(!cpf.equals(null)?"Ta certo":"Ta errado");
	}

}
