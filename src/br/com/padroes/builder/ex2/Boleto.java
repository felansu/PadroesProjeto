package br.com.padroes.builder.ex2;

import java.util.Calendar;

public interface Boleto {
	String getSacado();   
    String getCedente();
    Calendar getVencimento();
    double getValor();
}
