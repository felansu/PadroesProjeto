package br.com.padroes.builder.ex3GeradorArquivosFiscais;

import java.util.Date;

public class GeradorArquivoFiscal {
	private ArquivoFiscalBuilder arquivoFiscal;
	
	public GeradorArquivoFiscal(ArquivoFiscalBuilder arquivoFiscal){
		this.arquivoFiscal = arquivoFiscal;
	}
	
	public ArquivoFiscal gerarArquivoFiscal(){
		this.arquivoFiscal.buildCodigo("23423546");
		this.arquivoFiscal.buildDataEmissao(new Date());
		this.arquivoFiscal.buildItems("Ferrari");
		this.arquivoFiscal.buildPessoa("Ferran Gonzalez");
		this.arquivoFiscal.buildValor(6000D);
		
		return this.arquivoFiscal.getArquivoFiscal();
	}
}
