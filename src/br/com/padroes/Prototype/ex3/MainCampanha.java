package br.com.padroes.Prototype.ex3;

public class MainCampanha {
	public static void main(String[] args) {
		CampanhaPromocional campanha = new CampanhaPromocional();
		campanha.setChamada("Chamada principal");
		campanha.setEmpresa("Empresa principal");
		campanha.setProduto("Produto 0");
		campanha.setValor(5.3);
		System.out.println(campanha);
		
		CampanhaPromocional campanha2 = campanha.clonar();
		campanha2.setProduto("Produto 1");
		campanha2.setValor(10.0);
		System.out.println(campanha2);
		
		CampanhaPromocional campanha3 = campanha.clonar();
		campanha3.setProduto("Produto 2");
		campanha3.setValor(20.0);
		System.out.println(campanha3);
		
	}
}
