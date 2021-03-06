package br.com.padroes.builder.ex2;

import java.util.Calendar;

public interface BoletoBuilder {
	void buildSacado(String sacado);
    void buildCedente(String cedente);
    void buildValor(double valor);
    void buildVencimento(Calendar vencimento);
    void buildNossoNro(int nossoNro);
   
    Boleto getBoleto();
}
