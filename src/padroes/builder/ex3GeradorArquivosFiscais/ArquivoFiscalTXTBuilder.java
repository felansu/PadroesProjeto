package padroes.builder.ex3GeradorArquivosFiscais;

import java.util.Date;

public class ArquivoFiscalTXTBuilder implements ArquivoFiscalBuilder {

	private String pessoa;
	private String items;
	private Date dataEmissao;
	private double valor;
	private String codigo;

	public void buildPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public void buildItems(String items) {
		this.items = items;
	}

	public void buildDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public void buildValor(double valor) {
		this.valor = valor;
	}

	public void buildCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArquivoFiscal getArquivoFiscal() {
		return new ArquivoFiscalTXT(pessoa, items, dataEmissao, valor, codigo);
	}
}
