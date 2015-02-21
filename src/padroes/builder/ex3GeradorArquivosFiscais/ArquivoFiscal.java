package padroes.builder.ex3GeradorArquivosFiscais;

import java.util.Date;

public interface ArquivoFiscal {
	String getPessoa();
	String getItems();
	Date getDataEmissao();
	double getValor();
	String getCodigo();
	String toString();
}