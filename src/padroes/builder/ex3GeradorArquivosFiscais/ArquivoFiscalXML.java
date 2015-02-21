package padroes.builder.ex3GeradorArquivosFiscais;

import java.util.Date;

public class ArquivoFiscalXML implements ArquivoFiscal{

	private String pessoa;
	private String items;
	private Date dataEmissao;
	private double valor;
	private String codigo;
	
	public ArquivoFiscalXML(String pessoa, String items, Date dataEmissao,
			double valor, String codigo) {
		this.pessoa = pessoa;
		this.items = items;
		this.dataEmissao = dataEmissao;
		this.valor = valor;
		this.codigo = codigo;
	}

	public String getPessoa() {
		return this.pessoa;
	}

	public String getItems() {
		return this.items;
	}

	public Date getDataEmissao() {
		return this.dataEmissao;
	}

	public double getValor() {
		return this.valor;
	}

	public String getCodigo() {
		return this.codigo;
	}
	
	public String toString(){
		return "<XML " +this.codigo + this.items + this.pessoa + this.valor +" >";
	}
}