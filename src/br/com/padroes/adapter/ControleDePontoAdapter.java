package br.com.padroes.adapter;

public class ControleDePontoAdapter extends ControleDePonto{
	ControleDePontoNovo cpn;
	
	
	public ControleDePontoAdapter() {
		this.cpn = new ControleDePontoNovo();
	}

	public void registrarEntrada(Colaborador col) {
		cpn.registrarAcesso(col.getMatricula(), true);
	}

	public void registrarSaida(Colaborador col) {
		cpn.registrarAcesso(col.getMatricula(), false);
	}
}
