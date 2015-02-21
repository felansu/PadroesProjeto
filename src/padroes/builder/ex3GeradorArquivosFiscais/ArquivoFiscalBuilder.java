package padroes.builder.ex3GeradorArquivosFiscais;

import java.util.Date;


public interface ArquivoFiscalBuilder {
	void buildPessoa(String pessoa);
	void buildItems(String items);
	void buildDataEmissao(Date dataEmissao);
	void buildValor(double valor);
	void buildCodigo(String codigo);
	
	ArquivoFiscal getArquivoFiscal();
}
